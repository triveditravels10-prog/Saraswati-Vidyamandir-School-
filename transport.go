package main
import "fmt"
type Route struct{ From, To string }
func main(){
    routes := []Route{{"City Center","School"},{"Station","School"}}
    fmt.Println("Transport Routes:")
    for _, r := range routes { fmt.Println(r.From, "->", r.To) }
}
