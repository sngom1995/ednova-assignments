use rand::Rng;
use std::io::{self, Write};

const RANGE_START: i32 = 1;
const RANGE_END: i32 = 100;
const MAX_ATTEMPTS: Option<u32> = None;

fn generate_random_number(range_start: i32, range_end: i32) -> i32 {
    rand::thread_rng().gen_range(range_start..=range_end)
}

fn get_user_guess(range_start: i32, range_end: i32) -> Option<i32> {
    print!("Guess a number between {} and {}: ", range_start, range_end);
    io::stdout().flush().unwrap(); 

    let mut guess_str = String::new();
    match io::stdin().read_line(&mut guess_str) {
        Ok(_) => match guess_str.trim().parse::<i32>() {
            Ok(guess) if range_start <= guess && guess <= range_end => Some(guess),
            Ok(_) => {
                println!("Please enter a number within the range {}-{}.", range_start, range_end);
                None
            }
            Err(_) => {
                println!("Invalid input! Please enter an integer.");
                None
            }
        },
        Err(_) => {
            println!("Error reading input.");
            None
        }
    }
}

fn process_guess(guess: i32, target: i32) -> &'static str {
    if guess < target {
        "Too low."
    } else if guess > target {
        "Too high."
    } else {
        "Correct!"
    }
}

fn play_game() {
    println!("Welcome to the Guess the Number Game!");
    let target_number = generate_random_number(RANGE_START, RANGE_END);
    let mut attempts = 0;

    loop {
        match get_user_guess(RANGE_START, RANGE_END) {
            Some(guess) => {
                attempts += 1;
                let feedback = process_guess(guess, target_number);
                println!("{}", feedback);

                if feedback == "Correct!" {
                    println!("Congratulations! You guessed it in {} attempts.", attempts);
                    break;
                }

                if let Some(max_attempts) = MAX_ATTEMPTS {
                    if attempts >= max_attempts {
                        println!(
                            "Sorry, you've reached the maximum number of attempts. The number was {}.",
                            target_number
                        );
                        break;
                    }
                }
            }
            None => continue, 
        }
    }
}

fn main() {
    if let Err(e) = std::panic::catch_unwind(|| {
        play_game();
    }) {
        eprintln!("An unexpected error occurred: {:?}", e);
    }
}
