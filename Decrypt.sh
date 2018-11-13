echo Ingrese archivo a desecnriptar

read archivo

echo Ingrese nombre del nuevo archivo

read new_archivo

gpg -o $new_archivo -d $archivo

rm $archivo
