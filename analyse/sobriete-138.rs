

fn main() {
    println!("{}", erase("Bo nj  our"));

}


fn erase(string: &str) -> String {
    let size: usize = string.len();
    // En rust, les strings sont encodés en utf-8 il est donc impossible
    // de les indexer. La solution est de les passer en bytes
    let bytes = string.as_bytes();
    let mut result= String::new();

    for mut i in 0..size {
        let b: u8 = bytes[i];
        let car = b as char;

        if car == ' '  {
            let mut cpt = 1;

            while(i+cpt < size && bytes[i+cpt] as char == ' ') {
                result += " ";
                cpt += 1;
            }

            if(cpt != 1) {
                result += " ";
                i += cpt-1;
            }
        }

        else {
            result += &car.to_string();
        }
    }
    result
}


