package com.google.firebase.crashlytics.internal.stacktrace;

/* loaded from: classes3.dex */
public class MiddleOutFallbackStrategy implements StackTraceTrimmingStrategy {
    public final int a;
    public final StackTraceTrimmingStrategy[] b;
    public final MiddleOutStrategy c;

    public MiddleOutFallbackStrategy(int i, StackTraceTrimmingStrategy... stackTraceTrimmingStrategyArr) {
        this.a = i;
        this.b = stackTraceTrimmingStrategyArr;
        this.c = new MiddleOutStrategy(i);
    }

    @Override // com.google.firebase.crashlytics.internal.stacktrace.StackTraceTrimmingStrategy
    public StackTraceElement[] a(StackTraceElement[] stackTraceElementArr) {
        StackTraceTrimmingStrategy[] stackTraceTrimmingStrategyArr;
        if (stackTraceElementArr.length <= this.a) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArr2 = stackTraceElementArr;
        for (StackTraceTrimmingStrategy stackTraceTrimmingStrategy : this.b) {
            if (stackTraceElementArr2.length <= this.a) {
                break;
            }
            stackTraceElementArr2 = stackTraceTrimmingStrategy.a(stackTraceElementArr);
        }
        if (stackTraceElementArr2.length > this.a) {
            return this.c.a(stackTraceElementArr2);
        }
        return stackTraceElementArr2;
    }
}
