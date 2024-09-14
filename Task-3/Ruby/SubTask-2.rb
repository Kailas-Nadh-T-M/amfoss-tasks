input_file = 'input.txt'
output_file = 'output.txt'

begin
  input = File.open(input_file, 'r')
  output = File.open(output_file, 'w')

  input.each_line do |line|
    output.write(line)
  end
ensure
  input.close if input
  output.close if output
end
