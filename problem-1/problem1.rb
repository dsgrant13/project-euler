#Problem1.rb
#Daniel Grant
#Ruby solution to Project Euler #1

total = 0
(1...1000).each { |x| total += x if x % 3 == 0 || x % 5 == 0 }
puts total
