use std::io::{self,Read};
fn good_vs_evil(good: &str, evil: &str) -> String {
    //Assign good/evil worth
    let worth_good: Vec<u32> = vec![1, 2, 3, 3, 4, 10];
    let worth_evil: Vec<u32> = vec![1, 2, 2, 2, 3, 5, 10];
    
    //Make vectors of forces
   let count_good: Vec<u32> = good.split_whitespace().map(|c| c.parse().unwrap()).collect();
   let count_evil: Vec<u32> = evil.split_whitespace().map(|c| c.parse().unwrap()).collect();
   
    //get sums of sides
    // Check if the lengths of the vectors are the same
    if count_good.len() != worth_good.len() && count_evil.len() != worth_evil.len() {
        panic!("The lengths of the vectors are not the same");
    }
    let total_good: u32 = count_good.iter().zip(worth_good.iter()).map(|(&a, &b)| a * b).sum();
    let total_evil: u32 = count_evil.iter().zip(worth_evil.iter()).map(|(&a, &b)| a * b).sum();
    
    //compare and return value
    match total_good.cmp(&total_evil) {
        std::cmp::Ordering::Greater => "Battle Result: Good triumphs over Evil".to_string(),
        std::cmp::Ordering::Less => "Battle Result: Evil eradicates all trace of Good".to_string(),
        std::cmp::Ordering::Equal => "Battle Result: No victor on this battle field".to_string(),
    }

}