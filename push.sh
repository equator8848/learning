git add .

if [ "$1" ]; then
    msg=$1
else
    msg="update static resources at `date`"
fi

git commit -m "$msg"

git push origin master
