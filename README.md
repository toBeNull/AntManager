# AntManager
# 使用Ant构建并管理Android项目

##一.背景：
> 最近刚刚完成将公司的主项目从Eclipse迁移到Android Studio的工作，但还是有部分老项目需要在Eclipse下进行开发、维护，本文记录一下使用Ant对老项目进行管理的经验。
> 接到一个开发sdk的任务，要求提供demo测试该sdk，该任务已由他人在eclipse上完成了一部分，且尚未建立基线、只能从本地导出jar包和apk.为了便于管理，使用ant脚本对该项目进行构建管理。

##二.效果：

  **最终效果如下图：执行ant脚本自动生成jar或apk到指定release目录**

![最终效果](http://img.blog.csdn.net/20170317001848189?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQvdTAxMTM3MDM5MA==/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/SouthEast)
> 由于暂时还不能走发布系统打版，且需要不断测试，而每次手动导jar和apk耗时且不便对提测的jar和apk进行有效的管理。使用ant脚本自动化构建则能有效地解决这一问题。

##三.配置eclipse自动执行ant脚本：
 1. **配置Ant脚本**
 ![配置Ant脚本](http://img.blog.csdn.net/20170317001721874?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQvdTAxMTM3MDM5MA==/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/SouthEast)
 2. **选择并配置target**
 ![选择target栏目](http://img.blog.csdn.net/20170317003522758?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQvdTAxMTM3MDM5MA==/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/SouthEast)
 ![配置target](http://img.blog.csdn.net/20170317003609759?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQvdTAxMTM3MDM5MA==/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/SouthEast)
 3. **在eclipse中执行ant脚本**
 ![这里写图片描述](http://img.blog.csdn.net/20170317003701635?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQvdTAxMTM3MDM5MA==/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/SouthEast)
 4. **刷新主工程，查看效果**
 ![效果](http://img.blog.csdn.net/20170317003757808?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQvdTAxMTM3MDM5MA==/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/SouthEast)
 5. **修改脚本，得到不同级别的jar/apk**
 ![这里写图片描述](http://img.blog.csdn.net/20170317003911951?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQvdTAxMTM3MDM5MA==/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/SouthEast)
