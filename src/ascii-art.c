// #include <stdio.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <stddef.h>
#include <unistd.h>

int main()
{
    // printf("\x9B=1h");
    // printf("\033[8;20;30t");
    // char esc = '\x1B';
    // printf("%i\n", esc);

    // char *esc = "\x1B";
    // char csi = '\x9B';

    // printf(esc);
    // int length = strlen(esc);
    // printf("%d\n", length);

    // printf("\x1b[32mHello, World\n"); // set color text to green and print text
    // printf("\x1b[0m");                // reset color
    // size_t time = 1;
    // // for (int i = 0; i < 100; i++)
    // // {
    // //     printf("h");
    // //     fflush(stdout);
    // //     sleep(1);
    // // }
    // int i = 0;
    // for (i = 0; i < 10000; i++)
    // {
    //     printf("\rIn progress %d", i / 100);
    //     sleep(time);
    //     fflush(stdout);
    // }
    // printf("\n");
    return 0;
}

// #include <stdio.h>
// #include <stdlib.h>
// #include <string.h>
// #include <stddef.h>
// #include <unistd.h>

// void my_wait(size_t secs)
// {
//     sleep(secs);
// }

// void print_progress(size_t count, size_t max)
// {
//     const char prefix[] = "Progress: [";
//     const char suffix[] = "]";
//     const size_t prefix_length = sizeof(prefix) - 1;
//     const size_t suffix_length = sizeof(suffix) - 1;
//     char *buffer = calloc(max + prefix_length + suffix_length + 1, 1); // +1 for \0
//     size_t i = 0;

//     strcpy(buffer, prefix);
//     for (; i < max; ++i)
//     {
//         buffer[prefix_length + i] = i < count ? '#' : ' ';
//     }

//     strcpy(&buffer[prefix_length + i], suffix);
//     printf("\b%c[2K\r%s\n", 27, buffer);
//     fflush(stdout);
//     free(buffer);
// }

// #define NUM_SECS 10

// int main()
// {
//     size_t num_secs = 1, max_secs = NUM_SECS;
//     printf("%s\n", "");
//     print_progress(0, max_secs);
//     for (; num_secs <= max_secs; ++num_secs)
//     {
//         my_wait(1);
//         print_progress(num_secs, max_secs);
//     }

//     return 0;
// }

// #include <stdio.h>
// #include <stdlib.h>
// #include <sys/ioctl.h>

// void print_send_nudes()
// {
//     printf(" _____                _   _   _           _           \n");
//     printf("/  ___|              | | | \\ | |         | |          \n");
//     printf("\\ `--.  ___ _ __   __| | |  \\| |_   _  __| | ___  ___ \n");
//     printf(" `--. \\/ _ \\ '_ \\ / _` | | . ` | | | |/ _` |/ _ \\/ __|\n");
//     printf("/\\__/ /  __/ | | | (_| | | |\\  | |_| | (_| |  __/\\__ \\\n");
//     printf("\\____/ \\___|_| |_|\\__,_| \\_| \\_/\\__,_|\\__,_|\\___||___/\n");
// }

// void print_char()
// {
//     putchar('A');
//     putchar('\n');
// }

// int main()
// {
//     // struct of winsize with name w
//     // https://unix.superglobalmegacorp.com/Net2/newsrc/sys/ioctl.h.html
//     struct winsize w;

//     // 0 - as a non valid file descriptor
//     // TIOCGWINSZ - gets window size
//     // w - writing to the address of the struct w
//     // https://man7.org/linux/man-pages/man2/ioctl.2.html
//     ioctl(2, TIOCGWINSZ, &w);
//     printf("lines %d\n", w.ws_row);
//     printf("columns %d\n", w.ws_col);

//     printf("Hello\n");

//     // system("");
//     // printf("\e[0m");
//     printf("\033[20;25HWorld\n");

//     // print_send_nudes();
//     // print_char();
//     // printf("3\r1\n");

//     // int num = tcgetattr(STDIN_FILENO, oldt);
//     // printf("hello world\n");
//     // putchar('s');
//     // putchar('\n');
//     // // putchar('\n');
//     // // putchar('\n');
//     // system("clear");
//     // // fflush(stdin);
//     // printf("hello world\n");

//     return 0;
// }

// // Function to creating loading bar
// void loadingBar()
// {
//     // 0 - black background,
//     // A - Green Foreground
//     system("color 0A");

//     // Initialize char for printing
//     // loading bar
//     char a = 177, b = 219;

//     printf("\n\n\n\n");
//     printf("\n\n\n\n\t\t\t\t\t" + "Loading...\n\n");
//     printf("\t\t\t\t\t");

//     // Print initial loading bar
//     for (int i = 0; i < 26; i++)
//         printf("%c", a);

//     // Set the cursor again starting
//     // point of loading bar
//     printf("\r");
//     printf("\t\t\t\t\t");

//     // Print loading bar progress
//     for (int i = 0; i < 26; i++)
//     {
//         printf("%c", b);

//         // Sleep for 1 second
//         Sleep(1000);
//     }
// }

// // Driver Code
// int main()
// {
//     // Function Call
//     loadingBar();
//     return 0;
// }

// gcc -o ascii-art ascii-art.c && ./ascii-art
// ./ascii-art