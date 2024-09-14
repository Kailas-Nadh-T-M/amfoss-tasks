print "Enter the number of lines for the diamond: "
n = gets.to_i

(0...n).each do |i|
  (0...(n - i - 1)).each { print " " }
  (0...(2 * i + 1)).each { print "*" }
  puts
end

(n - 2).downto(0) do |i|
  (0...(n - i - 1)).each { print " " }
  (0...(2 * i + 1)).each { print "*" }
  puts
end
