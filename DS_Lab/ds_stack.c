#include <stdio.h>
#include <stdlib.h>

#define MAX_SIZE 100

// Global stack variables
int stack[MAX_SIZE];
int top = -1;

// Function prototypes
void push(int data);
int pop();
void display();
int peek();

int main() {
    int choice, data;

    while (1) {
        printf("\n----- Menu -----\n");
        printf("1. Push\n");
        printf("2. Pop\n");
        printf("3. Display\n");
        printf("4. Peek\n");
        printf("5. Exit\n");
        printf("Enter your choice: ");
        scanf("%d", &choice);

        switch (choice) {
            case 1:
                printf("Enter the element to push: ");
                scanf("%d", &data);
                push(data);
                break;
            case 2:
                data = pop();
                if (data != -1)
                    printf("Popped element: %d\n", data);
                break;
            case 3:
                display();
                break;
            case 4:
                data = peek();
                if (data != -1)
                    printf("Top element: %d\n", data);
                break;
            case 5:
                exit(0);
            default:
                printf("Invalid choice! Please try again.\n");
        }
    }

    return 0;
}

void push(int data) {
    if (top == MAX_SIZE - 1) {
        printf("Stack Overflow! Cannot push element.\n");
        return;
    }

    stack[++top] = data;
    printf("Element %d pushed to the stack.\n", data);
}

int pop() {
    if (top == -1) {
        printf("Stack Underflow! Cannot pop element.\n");
        return -1;
    }

    return stack[top--];
}

void display() {
    if (top == -1) {
        printf("Stack is empty.\n");
        return;
    }

    printf("Stack elements: ");
    for (int i = top; i >= 0; i--) {
        printf("%d ", stack[i]);
    }
    printf("\n");
}

int peek() {
    if (top == -1) {
        printf("Stack is empty.\n");
        return -1;
    }

    return stack[top];
}
