from django.shortcuts import render
from django.http import HttpResponse
from django.contrib import auth
# Create your views here.

from Login.models import Login



def Signin(request):
    # if request.method == 'get':
    #     return render(request, 'login.html')
    
    username1 = request.POST.get('username')
    password1 = request.POST.get('password')

    # username1 = "qwe"
    # password1 = "123"

    #user = auth.authenticate(request , username = username , password = password)

    do_login = Login(username=username1, password=password1)

    do_login.save()

    return HttpResponse("<p>数据添加成功！</p>")