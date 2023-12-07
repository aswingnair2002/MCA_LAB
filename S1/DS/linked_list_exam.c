#include<stdio.h>
#include<stdlib.h>
struct node{
	int data;
	struct node *next;
};
struct node *start = NULL;
void insertatfront(){
	struct node *newnode;
	int x;
	printf("Enter the Data : ");
	scanf("%d",&x);
	newnode=malloc(sizeof(struct node));
	newnode->data = x;
	newnode->next = start;
	start = newnode;
	
}
void insertatend(){
	struct node *newnode,*temp;
	int x;
	printf("Enter the Data : ");
	scanf("%d",&x);
	newnode=malloc(sizeof(struct node));
	newnode->data = x;
	newnode->next = NULL;
	temp = start;
	while(temp->next != NULL){
		temp = temp->next;
	}
	temp->next = newnode;
}
void insertatpos(){
	struct node *newnode,*temp;
	int x,p,i=0;
	temp = start;
	printf("Enter the Data : ");
	scanf("%d",&x);
	printf("Enter the Position : ");
	scanf("%d",&p);
	newnode=malloc(sizeof(struct node));
	newnode->data = x;
	newnode->next = NULL;
	while(i<p-1){
		temp=temp->next;
		i++;
	}
	newnode->next = temp->next;
	temp->next = newnode;
}
void deletefromfront(){
	struct node *temp;
	if(start==NULL){
		printf("List is Empty");
	}else{
		printf("%d is deleted",start->data);
		temp = start;
		start = temp->next;
		free(temp);
	}
}
void deletefromend(){
	struct node *temp,*prev;
	if(start==NULL){
		printf("List is Empty");
	}else{
		temp = start;
		while(temp->next != NULL){
			prev = temp;
			temp = temp->next;
		}
		prev->next = NULL;
		printf("%d is deleted",temp->data);
		free(temp);
	}
}
void deletefrompos(){
	struct node *temp,*prev;
	int i=0,p;
	if(start==NULL){
		printf("List is Empty");
	}else{
		temp = start;
		printf("Enter the Position : ");
		scanf("%d",&p);
		while(i<p-1){
			prev = temp;
			temp = temp->next;
			i++;
		}
		prev->next = temp->next;
		printf("%d is deleted",temp->data);
		free(temp);
	}
}
void display(){
	struct node *temp;
	temp = start;
	while(temp != NULL){
		printf("%d->",temp->data);
		temp = temp->next;
	}
}
void search(){
	struct node *temp;
	int x,i=1,f=0;
	if(start==NULL){
		printf("List is Empty");
	}else{
		temp = start;
		printf("Enter the data to be searched : ");
		scanf("%d",&x);
		while(temp->next != NULL){
			if(temp->data == x){
				printf("Data Found at the position %d",i);
				f=1;
				break;
			}
			temp=temp->next;
			i++;
		}
		if(f==0){
			printf("Data not Found");		
		}
	}
}
void main(){
	int ch;
	while(1){
		printf("\n1.Insert at Front\n2.Insert at End\n3.Insert at Position\n4.Delete from Front\n5.Delete from End\n6.Delete from Position\n7.Display\n8.Search\n9.Exit\n");
		printf("Enter Your Choice : ");
		scanf("%d",&ch);
		switch(ch){
			case 1 :
				insertatfront();
				break;
			case 2 :
				insertatend();
				break;
			case 3 :
				insertatpos();
				break;
			case 4 :
				deletefromfront();
				break;
			case 5 :
				deletefromend();
				break;
			case 6 :
				deletefrompos();
				break;
			case 7 :
				display();
				break;
			case 8 :
				search();
				break;
			case 9 :
				exit(0);
			default :
				printf("Enter a valid choice");
				break;
		}
	}
}
