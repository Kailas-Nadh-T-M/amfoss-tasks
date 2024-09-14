#include <stdio.h>

int main() {
    FILE *input = fopen("input.txt", "r");
    FILE *output = fopen("output.txt", "w");

    if (input == NULL || output == NULL) {
        perror("Error opening file");
        return 1;
    }

    int n;
    fscanf(input, "%d", &n);
    fclose(input);

    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n - i - 1; j++) {
            fputc(' ', output);
        }
        for (int j = 0; j < 2 * i + 1; j++) {
            fputc('*', output);
        }
        fputc('\n', output);
    }
    for (int i = n - 2; i >= 0; i--) {
        for (int j = 0; j < n - i - 1; j++) {
            fputc(' ', output);
        }
        for (int j = 0; j < 2 * i + 1; j++) {
            fputc('*', output);
        }
        fputc('\n', output);
    }

    fclose(output);
    return 0;
}
