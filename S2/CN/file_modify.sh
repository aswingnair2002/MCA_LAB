#!/bin/bash
copy(){
	read -p "Enter the path to copy" c
		cp $1 $c
}
edit(){
	gedit $1
}
rename(){
	read -p "Enter new name" new
	mv $1 $new
}
delete(){
	rm $1
}
read -p "Enter the File Name : " filename
while [ true ]
do
	echo "1.Copy"
	echo "2.Edit"
	echo "3.Rename"
	echo "4.Delete"
	echo "5.Exit"
	read -p "Enter your choice : " ch
	case $ch in
		1) copy $filename
		;;
		2) edit $filename
		;;
		3) rename $filename
		;;
		4) delete $filename
		;;
		5) exit
		;;
		default) echo "Enter a valid choice"
		;;
	esac
done
