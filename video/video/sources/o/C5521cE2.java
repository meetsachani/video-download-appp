package o;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Arrays;

/* renamed from: o.cE2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5521cE2 {
    public static a a;

    /* renamed from: o.cE2$a */
    /* loaded from: classes.dex */
    public interface a {
        void a(String str);
    }

    public static int a(int i) {
        int i2 = (i & (~(i >> 31))) - 255;
        return (i2 & (i2 >> 31)) + 255;
    }

    public static void c(String str) {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        String substring = (stackTraceElement.getMethodName() + "                  ").substring(0, 17);
        String str2 = ".(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + C9811tl1.d + "    ".substring(Integer.toString(stackTraceElement.getLineNumber()).length()) + substring;
        System.out.println(str2 + C4500Ve2.b + str);
        a aVar = a;
        if (aVar != null) {
            aVar.a(str2 + C4500Ve2.b + str);
        }
    }

    public static void d(String str, String str2) {
        PrintStream printStream = System.out;
        printStream.println(str + " : " + str2);
    }

    public static void e(String str, int i) {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        int min = Math.min(i, stackTrace.length - 1);
        String str2 = C4500Ve2.b;
        for (int i2 = 1; i2 <= min; i2++) {
            StackTraceElement stackTraceElement = stackTrace[i2];
            str2 = str2 + C4500Ve2.b;
            PrintStream printStream = System.out;
            printStream.println(str + str2 + (".(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + ") " + stackTraceElement.getMethodName()) + str2);
        }
    }

    public static void f(String str, String str2) {
        PrintStream printStream = System.err;
        printStream.println(str + " : " + str2);
    }

    public static int g(float f, float f2, float f3, float f4) {
        int a2 = a((int) (f * 255.0f));
        int a3 = a((int) (f2 * 255.0f));
        return (a2 << 16) | (a((int) (f4 * 255.0f)) << 24) | (a3 << 8) | a((int) (f3 * 255.0f));
    }

    public static void h(a aVar) {
        a = aVar;
    }

    public static void i(String str) {
        try {
            OutputStream outputStream = new Socket("127.0.0.1", 5327).getOutputStream();
            outputStream.write(str.getBytes());
            outputStream.close();
        } catch (IOException e) {
            PrintStream printStream = System.err;
            printStream.println(e.toString() + "\n" + Arrays.toString(e.getStackTrace()).replace(C6566gU0.f, "   at ").replace(",", "\n   at").replace(C6566gU0.g, ""));
        }
    }

    public int b(float[] fArr) {
        int a2 = a((int) (((float) Math.pow(fArr[0], 0.45454545454545453d)) * 255.0f));
        int a3 = a((int) (((float) Math.pow(fArr[1], 0.45454545454545453d)) * 255.0f));
        return (a((int) (fArr[3] * 255.0f)) << 24) | (a2 << 16) | (a3 << 8) | a((int) (((float) Math.pow(fArr[2], 0.45454545454545453d)) * 255.0f));
    }
}
