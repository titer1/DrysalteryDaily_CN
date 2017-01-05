
#1. 内存池技术
##1.1 ibm员工图书：C++ 应用程序性能优化

[C++ 应用程序性能优化 内存池](http://www.ibm.com/developerworks/cn/linux/l-cn-ppp/index6.html#N100C3)

图多，原理清晰。貌似代码不完整

```
测试利用内存池后的效果，通过一个很小的测试程序可以发现采用内存池机制后耗时为297 ms。而没有采用内存池机制则耗时625 ms，速度提高了52.48%。
```
速度提高的原因可以归结为几点，
- 除了偶尔的内存申请和销毁会导致从进程堆中分配和销毁内存块外，绝大多数的内存申请和销毁都由内存池在已经申请到的内存块中进行，而没有直接与进程堆打交道，而直接与进程堆打交道是很耗时的操作；
- 这是单线程环境的内存池，可以看到内存池的Alloc和Free操作中并没有加线程保护措施。

##1.2 boost pool性能比较

[开源C++函数库Boost内存池使用与测试](http://tech.it168.com/a2011/0726/1223/000001223399_all.shtml)

```
在连续申请和连续释放10万块内存的情况下，使用内存池耗时是使用new耗时的47.46%。
在反复申请和释放50万次内存的情况下，使用内存池耗时是使用new耗时的64.34%。
在反复申请和释放50万个C++对象的情况下，使用内存池耗时是使用new耗时的112.03%。这是因为内存池的construct和destroy函数增加了函数调用次数的原因。这种情况下使用内存池并不能获得性能上的优化

```


##1.3 其他原创轮子
TODO





#2. 线程池技术
todo优化按照语言分，按照基础 进阶

[《C++ Concurrency in Action: 高级线程管理](http://wiki.jikexueyuan.com/project/cplusplus-concurrency-action/content/chapter9/chapter9-chinese.html)
```
std::vector<std::thread> thread_pool;
基于线程池的快速排序实现
```
[High performance C++14 thread pool with ben | github](https://github.com/inkooboo/thread-pool-cpp)

[Linux平台下C++(C++98、C++03、C++11)实现的线程池| github ,no bench](https://github.com/lizhenghn123/zl_threadpool)

[用 C++ 写线程池是怎样一种体验？](https://www.zhihu.com/question/27908489)

[ Linux高性能服务器编程——进程池和线程池](http://blog.csdn.net/walkerkalr/article/details/37729323)

[Java几种线程池的分析和使用](https://zhuanlan.zhihu.com/p/22882522)
[如何合理地估算线程池大小？](https://edagarli.gitbooks.io/java-route/content/ru_he_he_li_di_gu_suan_xian_cheng_chi_da_xiao_ff1f.html)
```
Java成神技术路线
JVM 优化
如何将新对象预留在年轻代
如何让大对象进入年老代
如何设置对象进入年老代的年龄
稳定的 Java 堆 VS 动荡的 Java 堆
增大吞吐量提升系统性能
尝试使用大的内存分页
Java基础知识
Java NIO与IO
Java并发编程
Java并发编程之CAS
ConcurrentHashMap 的实现原理
深入理解ThreadLocal
如何合理地估算线程池大小？
无锁的并行计算之Amino框架
优化高并发之协程
Disruptor使用入门

```
[线程池的介绍及简单实现 | java, linux,with code]()
##todo

threadpool c++ performance



#参考 
##技术雷达
  实战经验能力（程序员参与过哪些程序的开发，使用过什么类库、框架）
