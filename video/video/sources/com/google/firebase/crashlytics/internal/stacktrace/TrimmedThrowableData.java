package com.google.firebase.crashlytics.internal.stacktrace;

import java.util.Stack;
import o.InterfaceC11300zs1;

/* loaded from: classes3.dex */
public class TrimmedThrowableData {
    public final String a;
    public final String b;
    public final StackTraceElement[] c;
    @InterfaceC11300zs1
    public final TrimmedThrowableData d;

    public TrimmedThrowableData(String str, String str2, StackTraceElement[] stackTraceElementArr, @InterfaceC11300zs1 TrimmedThrowableData trimmedThrowableData) {
        this.a = str;
        this.b = str2;
        this.c = stackTraceElementArr;
        this.d = trimmedThrowableData;
    }

    public static TrimmedThrowableData a(Throwable th, StackTraceTrimmingStrategy stackTraceTrimmingStrategy) {
        Stack stack = new Stack();
        while (th != null) {
            stack.push(th);
            th = th.getCause();
        }
        TrimmedThrowableData trimmedThrowableData = null;
        while (!stack.isEmpty()) {
            Throwable th2 = (Throwable) stack.pop();
            trimmedThrowableData = new TrimmedThrowableData(th2.getLocalizedMessage(), th2.getClass().getName(), stackTraceTrimmingStrategy.a(th2.getStackTrace()), trimmedThrowableData);
        }
        return trimmedThrowableData;
    }
}
