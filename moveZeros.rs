fn move_zeros(arr: &[u8]) -> Vec<u8> {
    let mut new_vec = arr.to_vec();
    let mut j = 0;
    //Should have made an empty vector and copied values from slice to new vec
    for i in 0..new_vec.len() {
        if new_vec[i] != 0 {
            new_vec[j] = new_vec[i];
            j += 1;
        }
    }
    for x in j..new_vec.len() {
        new_vec[x] = 0;
    }
    new_vec
}
