git status

git add *

git status

git commit -m $1

if [ $2 == "true" ]; then
	git push
fi
