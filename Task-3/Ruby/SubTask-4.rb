input_file = 'input.txt'
output_file = 'output.txt'

begin
  n = File.read(input_file).to_i
  File.open(output_file, 'w') do |output|
    (0...n).each do |i|
      output.write(" " * (n - i - 1))
      output.write("*" * (2 * i + 1))
      output.write("\n")
    end
    (n - 2).downto(0) do |i|
      output.write(" " * (n - i - 1))
      output.write("*" * (2 * i + 1))
      output.write("\n")
    end
  end
rescue => e
  puts "E: #{e.message}"
end
