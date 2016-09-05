package com.klr.utilsclass.utils;

import android.util.Log;

/**
 * Created by BJ-0002 on 2016/9/5.
 *
 * @author klr
 */
public class PrintLog {
    /*log 开关,发版时，将logFlag设置为false，日志将不会打印*/
    private final static boolean logFlag = true;
    /*log Tag，标识，可以在搜索中打上此tag看到打印的内容*/
    public final static String Tag = "[AppName]";
    /*log level (unused)：你想打印log的最小级别*/
    private final static int logLevel = Log.VERBOSE;
    private static PrintLog mPrintLog = new PrintLog();

    /**
     * 由于要使用静态调用，而this.getClass().getName()中this不允许方法是静态方法
     * 所以使用静态类调用方法的方式，所以抽出此方法
     * @return
     */
    private static String getFlagData() {
        if (mPrintLog == null) {
            mPrintLog = new PrintLog();
        }
        return mPrintLog.getData();
    }

    /**
     * 获取当前打印日志信息，包括当前线程，文件名（类名），行数和方法名
     * @return
     */
    private String getData() {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (stackTrace == null) {
            return null;
        }
        for (StackTraceElement st : stackTrace) {
            if (st.isNativeMethod()) {
                continue;
            }
            if (st.getClassName().equals(Thread.class.getName())) {
                continue;
            }
            if (st.getClassName().equals(this.getClass().getName())) {
                continue;
            }
            return "[" + Thread.currentThread().getName() + ":"
                    + st.getFileName() + ":" + st.getLineNumber() + " "
                    + st.getMethodName() + "]";
        }
        return null;
    }

    /**
     * verbose
     * @param str
     */
    public static void v(Object str) {
        if (logFlag) {
            if (logLevel <= Log.VERBOSE) {
                String flagData = getFlagData();
                if (flagData != null) {
                    Log.v(Tag, flagData + "-" + str);
                } else {
                    Log.v(Tag, str != null ? str.toString() : "");
                }
            }
        }
    }

    public static void v(String tag, Object str) {
        if (tag == null) {
            tag=Tag;
        }
        if (logFlag) {
            if (logLevel <= Log.VERBOSE) {
                String flagData = getFlagData();
                if (flagData != null) {
                    Log.v(tag, flagData + "-" + str);
                } else {
                    Log.v(tag, str != null ? str.toString() : "");
                }
            }
        }
    }

    /**
     * debug
     * @param str
     */
    public static void d(Object str) {
        if (logFlag) {
            if (logLevel <= Log.DEBUG) {
                String flagData = getFlagData();
                if (flagData != null) {
                    Log.d(Tag, flagData + "-" + str);
                } else {
                    Log.d(Tag, str != null ? str.toString() : "");
                }
            }
        }
    }

    public static void d(String tag, Object str) {
        if (tag == null) {
            tag=Tag;
        }
        if (logFlag) {
            if (logLevel <= Log.DEBUG) {
                String flagData = getFlagData();
                if (flagData != null) {
                    Log.d(tag, flagData + "-" + str);
                } else {
                    Log.d(tag, str != null ? str.toString() : "");
                }
            }
        }
    }

    /**
     * info
     * @param str
     */
    public static void i(Object str) {
        if (logFlag) {
            if (logLevel <= Log.INFO) {
                String flagData = getFlagData();
                if (flagData != null) {
                    Log.i(Tag, flagData + "-" + str);
                } else {
                    Log.i(Tag, str != null ? str.toString() : "");
                }
            }
        }
    }

    public static void i(String tag, Object str) {
        if (tag == null) {
            tag=Tag;
        }
        if (logFlag) {
            if (logLevel <= Log.INFO) {
                String flagData = getFlagData();
                if (flagData != null) {
                    Log.i(tag, flagData + "-" + str);
                } else {
                    Log.i(tag, str != null ? str.toString() : "");
                }
            }
        }
    }

    /**
     * warn
     * @param str
     */
    public static void w(Object str) {
        if (logFlag) {
            if (logLevel <= Log.WARN) {
                String flagData = getFlagData();
                if (flagData != null) {
                    Log.w(Tag, flagData + "-" + str);
                } else {
                    Log.w(Tag, str != null ? str.toString() : "");
                }
            }
        }
    }

    public static void w(String tag, Object str) {
        if (tag == null) {
            tag=Tag;
        }
        if (logFlag) {
            if (logLevel <= Log.WARN) {
                String flagData = getFlagData();
                if (flagData != null) {
                    Log.w(tag, flagData + "-" + str);
                } else {
                    Log.w(tag, str != null ? str.toString() : "");
                }
            }
        }
    }

    /**
     * error
     * @param str
     */
    public static void e(Object str) {
        if (logFlag) {
            if (logLevel <= Log.ERROR) {
                String flagData = getFlagData();
                if (flagData != null) {
                    Log.e(Tag, flagData + "-" + str);
                } else {
                    Log.e(Tag, str != null ? str.toString() : "");
                }
            }
        }
    }

    public static void e(String tag, Object str) {
        if (tag == null) {
            tag=Tag;
        }
        if (logFlag) {
            if (logLevel <= Log.ERROR) {
                String flagData = getFlagData();
                if (flagData != null) {
                    Log.e(tag, flagData + "-" + str);
                } else {
                    Log.e(tag, str != null ? str.toString() : "");
                }
            }
        }
    }
}
