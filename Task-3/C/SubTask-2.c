#include <stdio.h>

int main() {
    FILE *input = fopen("input.txt", "r");
    FILE *output = fopen("output.txt", "w");

    if (input == NULL || output == NULL) {
        perror("Error opening file");
        return 1;
    }

    char ch;
    while ((ch = fgetc(input)) != EOF) {
        fputc(ch, output);
    }

    fclose(input);
    fclose(output);
    return 0;
}
