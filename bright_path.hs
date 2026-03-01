-- bright_path.hs
data Student = Student { name :: String, cls :: String, achievement :: String } deriving Show

students = [Student "Rohan Kumar" "10th" "Math Topper", Student "Anjali Singh" "9th" "Debate Champion"]

main = do
    putStrLn "Student List:"
    mapM_ (\s -> putStrLn $ name s ++ " | " ++ cls s ++ " | " ++ achievement s) students
