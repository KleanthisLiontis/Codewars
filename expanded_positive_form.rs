fn expanded_form(n: u64) -> String {
    let num_str = num.to_string();
    let mut result = String::new();

    for (i, digit) in num_str.chars().enumerate() {
        if digit != '0' {
            if !result.is_empty() {
                result.push_str(" + ");
            }
            result.push_str(&format!("{}{}", digit, "0".repeat(num_str.len() - i - 1)));
        }
    }

    result
}