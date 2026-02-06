package com.facebook.bolts;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.List;
import o.C3771Nr1;
import o.C6562gT0;
import o.C8222nF;
import o.C9516sY;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.facebook.bolts.a  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2329a extends Exception {
    @NotNull
    public static final C0077a Y = new C0077a(null);
    private static final long serialVersionUID = 1;
    @NotNull
    public final List<Throwable> X;

    /* renamed from: com.facebook.bolts.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0077a {
        public /* synthetic */ C0077a(C9516sY c9516sY) {
            this();
        }

        public C0077a() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C2329a(@Nullable String str, @Nullable List<? extends Throwable> list) {
        super(str, r0);
        Throwable th;
        if (list != null && !list.isEmpty()) {
            th = list.get(0);
        } else {
            th = null;
        }
        List<Throwable> unmodifiableList = Collections.unmodifiableList(list == null ? C8222nF.H() : list);
        C6562gT0.o(unmodifiableList, "unmodifiableList(innerThrowables ?: emptyList())");
        this.X = unmodifiableList;
    }

    @Override // java.lang.Throwable
    public void printStackTrace(@NotNull PrintStream printStream) {
        C6562gT0.p(printStream, C3771Nr1.N0);
        super.printStackTrace(printStream);
        int i = -1;
        for (Throwable th : this.X) {
            printStream.append("\n");
            printStream.append("  Inner throwable #");
            i++;
            printStream.append((CharSequence) String.valueOf(i));
            printStream.append(": ");
            if (th != null) {
                th.printStackTrace(printStream);
            }
            printStream.append("\n");
        }
    }

    @Override // java.lang.Throwable
    public void printStackTrace(@NotNull PrintWriter printWriter) {
        C6562gT0.p(printWriter, C3771Nr1.N0);
        super.printStackTrace(printWriter);
        int i = -1;
        for (Throwable th : this.X) {
            printWriter.append("\n");
            printWriter.append("  Inner throwable #");
            i++;
            printWriter.append((CharSequence) String.valueOf(i));
            printWriter.append(": ");
            if (th != null) {
                th.printStackTrace(printWriter);
            }
            printWriter.append("\n");
        }
    }
}
