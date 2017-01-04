
This is chinese version, later will added english version


#1.java


[compare c++ with java](https://java.quanke.name/%E9%99%84%E5%BD%95B%20%E5%AF%B9%E6%AF%94C++%E5%92%8CJava.html)

[从表到里学习JVM实现|至少6本](https://www.douban.com/doulist/2545443/)

```
这里选取《Virtual Machines: Versatile Platforms for Systems and Processes》，帮助您了解“虚拟机”一词到底指代什么，有什么不同类型，大概有哪些实现方法，等等。读完这本书有助获得一个清晰的大局观

先通过《Language Implementation Patterns》了解编程语言的一些入门级实现方式，把高级语言编译器与虚拟机两个概念联系起来。 

后通过《プログラミング言語を作る》(自制编程语言)了解非常简易的、用树遍历式以及字节码式解释器实现虚拟机大概是个怎么回事。虽然这本书没有实现JVM，但它介绍的Diksam与早期JVM的实现颇有相似之处，可参考。 

接下来《深入嵌入式Java虚拟机》介绍了一种实际的JVM——KVM的实现细节。KVM是CLDC的参考实现（RI）里的JVM，结构简单，资源消耗小，适合入门阅读

陈涛的《HotSpot实战》主要介绍了HotSpot VM的核心VM的实现。第一版的内容还不算深，介绍runtime的部分比较多，而介绍GC与动态编译器的具体实现的部分比较少。想对HotSpot VM的实现有初步了解，但担心GC与编译原理的知识太难的同学可以从这本书入手。 
（不过请注意自己对着代码确实把知识消化掉，因为这个第一版的内容有不少小错误嗯…） 

```
##1.1 java容器研究
[给jdk写注释系列之jdk1.6容器 系列之一 | 理论实践结合+benchmark](http://www.cnblogs.com/tstd/p/5138104.html)
```
对于java容器或集合的学习也可以看做是对数据结构的学习与应用。在前面我们分析了很多的java容器，也接触了好多种常用的数据结构，今天我们就来总结下这些内容。
```
[java_mzd作品：线性表分析及Java实现](http://java-mzd.iteye.com/blog/826059)
```
我们写的ArrayList在插入方法的效率都已经超过JDK了，而且也接近LinkedLst了。撒花！！！
```
[java_mzd作品：Hash表分析以及Java实现](http://java-mzd.iteye.com/blog/827523)
```
  100W个数据时，全部存储时间为1S多一点，而搜寻时间为0 
```

[Java集合框架Koloboke详解| 含官网链接+内置benchmark](http://blog.csdn.net/chszs/article/details/50511851)
```
Koloboke目前的版本主要是替换java.util.HashSet和java.util.HashMap。
Koloboke提供了一套完整的集合原始类型的实现，可以避免开销很大的装箱/拆箱操作，节省了原始类型装箱消耗的内存。
```


##实践类
[集合android UI特效的开源工程|某android大牛作品](http://www.codekk.com)


#2 python

##2.1基础
[python 数据结构 在线实践](http://interactivepython.org/courselib/static/pythonds/Introduction/toctree.html)
```所见即所得
```
[python 数据结构 在线实践 之阅读笔记](https://hujiaweibujidao.github.io/python/)
##2.2性能
[对你的 Python 代码进行性能分析](http://pycoders-weekly-chinese.readthedocs.io/en/latest/issue10/down-the-rabbit-hole-profiling-your-python-code.html)
```
 cProfile 。 行分析器 可以给出每一行的运行时间.66:希望有一个思维导图guide
```
[Python 性能小贴士 (第1部分)|各种tips](http://pycoders-weekly-chinese.readthedocs.io/en/latest/issue1/python-performance-tips-part-1.html)
```
YouTube 已经证明了 Python 有能力处理每小时4000万视频的需求
```
#3. c

#4. c++

#5. others
[程序员技能雷达](http://yanghuidang.iteye.com/blog/1267547)

[程序员读书雷达](http://m.blog.csdn.net/article/details?id=52329358)

[JDK自带工具之问题排查场景示例](http://mp.weixin.qq.com/s?src=3&timestamp=1482223939&ver=1&signature=uU8JOuu3EvW4WBCkvgRwIqhC7qx7Rk*CwDLmABy9AmSQAT4OzhvQ5ks8j7HStE8pvaUnI8oA3FKotx67KLvQntXIhbznjtIJGDYMnLsrJdVbYi5S-dFAQelWfQLNxg6eKPRUQvVw-J0xB5vkTw9Fg7dGKjAPghBSX0As5N1QbQs=)


##todo
-希望找到python内置数据结构模拟实现的性能对比


#6.attachments

##java虚拟机（JVM）书单精选

-周志明的《深入理解Java虚拟机》

-自制编程语言

-Language Implementation Patterns

-HotSpot实战
