###	*关于操作系统换行符（CRLF）*
Dos与Linux换行符不同，利用cat –A 来观察Dos和Linux建立的文件格式。

在Dos中使用的换行符为^M$，称之为CR与LF两个符号。而在Linux操作系统中，仅有LF（$）这个换行符，这个换行符对于Linux系统的影响很大。

由于换行符导致的shell无法执行情况：

在开始执行Linux命令时，判断依据是Enter，而Linux的Enter为LF符号，由于Dos的换行符是CRLF，就多了一个^M符号，在这种情况下，如果执行一个Shell脚本，将可能造成程序无法执行的情况。

解决方式：

	dos2unix [-kn] file [newfile]
	unix2dos [-kn] file [newfile]
		-k:保留该文件原来的mtime格式
		-n:保留原来的文件，将转换后的内容输出到新文件

操作系统可能未安装此命令。
	
使用VI编辑器解决换行符问题：

使用VI编辑器命令模式：

	set fileformat=unix
	set fileformat=dos

项目中实际遇到的坑：

	1、部署全量版本时，打出来的全量包中包含的启动脚本因为Git版本管理，文件换行符全部为CRLF，导致的启动脚本启动不生效。
