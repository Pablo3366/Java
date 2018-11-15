echo ingrese archivo a encriptar: 
read archivo

gpg -c $archivo

#git rm $archivo
rm $archivo
#git add $archivo.gpg

echo Listo!!
