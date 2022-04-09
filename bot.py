import json
import requests
import vk_api
from vk_api.keyboard import VkKeyboard,VkKeyboardColor
from vk_api import VkUpload
from vk_api.longpoll import VkLongPoll, VkEventType
import datetime
import random
 
 
vk_session = vk_api.VkApi(token='088514ad32b72c5228fd7596ad06b90d9676a5304cbfc656b4805d09ae402fd108a31a3918b158e43a6a9')
upload = VkUpload(vk_session)#dlya izobrajeniy
longpoll = VkLongPoll(vk_session)
 
vk = vk_session.get_api()
 
for event in longpoll.listen():
    if event.type == VkEventType.MESSAGE_NEW and event.to_me and event.text:
   #Слушаем longpoll, если пришло сообщение то:			
        if hasattr(event, 'payload'):
            print(event.payload)
        if event.text == 'Привет' or event.text == 'привет': #Если написали заданную фразу
            if event.from_user: #Если написали в ЛС
                vk.messages.send( #Отправляем сообщение
                    user_id=event.user_id,
                    random_id = random.randint(0,999999999),
                    message='Привет вездекодерам!'
                )
  
            
    if event.type == VkEventType.MESSAGE_NEW and event.to_me and event.text:		
        if event.text == 'Вопросы'or event.text == 'вопросы': #Если написали заданную фразу
            if event.from_user: #Если написали в ЛС
                #buttons = ["blue","red","white","green"]
                #buttons_colors = [VkKeyboardColor.PRIMARY,VkKeyboardColor.NEGATIVE,VkKeyboardColor.SECONDARY,VkKeyboardColor.POSITIVE]
                #for btn,btn_color in zip(buttons,buttons_colors):
                #    keyboarda.add_button(btn,btn_color)
 
                #возраст
                keyboard1 = VkKeyboard(one_time = True)
                buttons1 = ["Младше 18","18 - 45","45+"]
                buttons_colors1 = [VkKeyboardColor.NEGATIVE,VkKeyboardColor.PRIMARY,VkKeyboardColor.SECONDARY]
 
                for btn1, btn_color1 in zip(buttons1,buttons_colors1):
                    keyboard1.add_button(btn1,btn_color1,payload={'klava': 1})
 
                vk.messages.send( #Отправляем сообщение
                    user_id=event.user_id,
                    random_id = random.randint(0,999999999),
                    keyboard = keyboard1.get_keyboard(),
                    message='В какой ты возрастной группе?'
                )
                
    if hasattr(event, 'payload'):
        if event.type == VkEventType.MESSAGE_NEW and event.to_me and event.payload == "{\"klava\":1}" and event.text:
            if event.from_user:
                keyboard2 = VkKeyboard(one_time = True)
                keyboard2.add_button("ДА!",VkKeyboardColor.POSITIVE,payload={'klava': 2})
                keyboard2.add_line()
                keyboard2.add_button("НЕТ!",VkKeyboardColor.NEGATIVE,payload={'klava': 2})
                
                vk.messages.send( #Отправляем сообщение
                    user_id=event.user_id,
                    random_id = random.randint(0,999999999),
                    keyboard = keyboard2.get_keyboard(),
                    message='Ты любишь пиццу с ананасами?'
                )
                
    if hasattr(event, 'payload'):
        if event.type == VkEventType.MESSAGE_NEW and event.to_me and event.payload == "{\"klava\":2}" and event.text:
            if event.from_user:
                keyboard3 = VkKeyboard(one_time = True)
                keyboard3.add_button("Серый",VkKeyboardColor.NEGATIVE,payload={'klava': 3})
                keyboard3.add_button("Бурый",VkKeyboardColor.NEGATIVE,payload={'klava': 3})
                keyboard3.add_line()
                keyboard3.add_button("Малиновый",VkKeyboardColor.POSITIVE,payload={'klava': 3})
                
                vk.messages.send( #Отправляем сообщение
                    user_id=event.user_id,
                    random_id = random.randint(0,999999999),
                    keyboard = keyboard3.get_keyboard(),
                    message='Какой из цветов наиболее красивый?\n 1.Серый \n 2.Бурый \n 3.Малиновый '
                )
    if hasattr(event, 'payload'):
        if event.type == VkEventType.MESSAGE_NEW and event.to_me and event.payload == "{\"klava\":3}" and event.text:
            if event.from_user:
                keyboard4 = VkKeyboard(one_time = True)
                keyboard4.add_button("Я!!!!",VkKeyboardColor.PRIMARY,payload={'klava': 4})
                
                vk.messages.send( #Отправляем сообщение
                    user_id=event.user_id,
                    random_id = random.randint(0,999999999),
                    keyboard = keyboard4.get_keyboard(),
                    message='Кто милашка?'
                )
    if hasattr(event, 'payload'):
        if event.type == VkEventType.MESSAGE_NEW and event.to_me and event.payload == "{\"klava\":4}" and event.text:
            if event.from_user:
                keyboard5 = VkKeyboard(one_time = True)
                keyboard5.add_button("Вверх",VkKeyboardColor.PRIMARY,payload={'klava': 5})
                keyboard5.add_line()
                keyboard5.add_button("Влево",VkKeyboardColor.SECONDARY,payload={'klava': 5})
                keyboard5.add_button("Вправо",VkKeyboardColor.SECONDARY,payload={'klava': 5})
                keyboard5.add_line()
                keyboard5.add_button("Вниз",VkKeyboardColor.PRIMARY,payload={'klava': 5})
                
                vk.messages.send( #Отправляем сообщение
                    user_id=event.user_id,
                    random_id = random.randint(0,999999999),
                    keyboard = keyboard5.get_keyboard(),
                    message='Куда пойдем?'
                )
                
    if hasattr(event, 'payload'):
        if event.type == VkEventType.MESSAGE_NEW and event.to_me and event.payload == "{\"klava\":5}" and event.text:
            if event.from_user:
                keyboard6 = VkKeyboard(one_time = True)
                keyboard6.add_button("Не меня",VkKeyboardColor.PRIMARY,payload={'klava': 6})
                keyboard6.add_line()
                keyboard6.add_button("И не меня",VkKeyboardColor.PRIMARY,payload={'klava': 6})
                keyboard6.add_line()
                keyboard6.add_button("Пж нет",VkKeyboardColor.SECONDARY,payload={'klava': 6})
                keyboard6.add_button("Нееееет",VkKeyboardColor.PRIMARY,payload={'klava': 6})
                
                vk.messages.send( #Отправляем сообщение
                    user_id=event.user_id,
                    random_id = random.randint(0,999999999),
                    keyboard = keyboard6.get_keyboard(),
                    message='Поиграем в дженгу?'
                )
    if hasattr(event, 'payload'):
        if event.type == VkEventType.MESSAGE_NEW and event.to_me and event.payload == "{\"klava\":6}" and event.text:
            if event.from_user:
                keyboard7 = VkKeyboard(one_time = True)
                keyboard7.add_button("Конечно, на квасе",VkKeyboardColor.NEGATIVE,payload={'klava': 7})
                keyboard7.add_button("Конечно, на квасе",VkKeyboardColor.NEGATIVE,payload={'klava': 7})
                keyboard7.add_button("Конечно, на квасе",VkKeyboardColor.NEGATIVE,payload={'klava': 7})
                keyboard7.add_line()
                keyboard7.add_button("Конечно, на квасе",VkKeyboardColor.NEGATIVE,payload={'klava': 7})
                keyboard7.add_button("КЕФИР!!!!",VkKeyboardColor.POSITIVE,payload={'klava': 7})
                keyboard7.add_button("Конечно, на квасе",VkKeyboardColor.NEGATIVE,payload={'klava': 7})
                keyboard7.add_line()
                keyboard7.add_button("Конечно, на квасе",VkKeyboardColor.NEGATIVE,payload={'klava': 7})
                keyboard7.add_button("Конечно, на квасе",VkKeyboardColor.NEGATIVE,payload={'klava': 7})
                keyboard7.add_button("Конечно, на квасе",VkKeyboardColor.NEGATIVE,payload={'klava': 7})
    
                
                vk.messages.send( #Отправляем сообщение
                    user_id=event.user_id,
                    random_id = random.randint(0,999999999),
                    keyboard = keyboard7.get_keyboard(),
                    message='Так, все же, на квасе или на кефире?'
                )
    if hasattr(event, 'payload'):
        if event.type == VkEventType.MESSAGE_NEW and event.to_me and event.payload == "{\"klava\":7}" and event.text:
            if event.from_user:
                keyboard8 = VkKeyboard(one_time = True)
                keyboard8.add_button("Они прекрасны",VkKeyboardColor.POSITIVE,payload={'klava': 8})
                keyboard8.add_line()
                keyboard8.add_button("Они великолепны",VkKeyboardColor.POSITIVE,payload={'klava': 8})
                keyboard8.add_line()
                keyboard8.add_button("Это что-то невероятное",VkKeyboardColor.POSITIVE,payload={'klava': 8})
                keyboard8.add_line()
                keyboard8.add_button("Просто снос башки",VkKeyboardColor.POSITIVE,payload={'klava': 8})
                
                
                vk.messages.send( #Отправляем сообщение
                    user_id=event.user_id,
                    random_id = random.randint(0,999999999),
                    keyboard = keyboard8.get_keyboard(),
                    message='Как тебе вопросы :)?'
                )