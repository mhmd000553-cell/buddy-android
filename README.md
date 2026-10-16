# Buddy Android — سكافولد MVP (نسخة ابتدائية)

هذا المستودع يحتوي على سكافولد أولي لتطبيق Android "Buddy" وفق المواصفات التي زوّدتني بها: خدمة إمكانية الوصول، فقاعة عائمة، وخادم MCP محلي (stub). هذه نسخة تعليمية/هيكليّة؛ لا تتضمن تحميل proot أو تثبيت وكلاء فعلية.

المحتوى المضمّن:
- Android app (Kotlin) مع AccessibilityService skeleton
- Bubble/ChatActivity stub
- MCP local server stub (NanoHTTPD)
- أدوات placeholder: readScreen(), tap(), typeText(), scroll(), screenshot()
- linux/README يشرح الفكرة
- ملفات CONTRIBUTING وSECURITY

تعليمات بناء سريعة:
1. افتح المشروع في Android Studio.
2. قم بمزامنة Gradle.
3. شغّل على جهاز فعلي (minSdk 30 / Android 11+). الخدمة تتطلب تمكين Accessibility يدويًا عبر إعدادات الجهاز.

ملاحظات أمنية:
- هذه النسخة لا تمنح أي صلاحيات تلقائياً. تأكّد من مراجعة SECURITY.md قبل اختبار أي وظائف تتحكم بالهاتف.
