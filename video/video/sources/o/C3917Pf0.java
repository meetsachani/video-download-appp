package o;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* renamed from: o.Pf0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C3917Pf0 {
    @IH0
    @InterfaceC6480g82(version = "1.1")
    public static void a(@NotNull Throwable th, @NotNull Throwable th2) {
        C6562gT0.p(th, "<this>");
        C6562gT0.p(th2, "exception");
        if (th != th2) {
            C9195rD1.a.a(th, th2);
        }
    }

    @NotNull
    public static final StackTraceElement[] b(@NotNull Throwable th) {
        C6562gT0.p(th, "<this>");
        StackTraceElement[] stackTrace = th.getStackTrace();
        C6562gT0.m(stackTrace);
        return stackTrace;
    }

    @NotNull
    public static final List<Throwable> d(@NotNull Throwable th) {
        C6562gT0.p(th, "<this>");
        return C9195rD1.a.d(th);
    }

    @XP0
    public static final void f(Throwable th) {
        C6562gT0.p(th, "<this>");
        th.printStackTrace();
    }

    @XP0
    public static final void g(Throwable th, PrintStream printStream) {
        C6562gT0.p(th, "<this>");
        C6562gT0.p(printStream, "stream");
        th.printStackTrace(printStream);
    }

    @XP0
    public static final void h(Throwable th, PrintWriter printWriter) {
        C6562gT0.p(th, "<this>");
        C6562gT0.p(printWriter, "writer");
        th.printStackTrace(printWriter);
    }

    @InterfaceC6480g82(version = "1.4")
    @NotNull
    public static String i(@NotNull Throwable th) {
        C6562gT0.p(th, "<this>");
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        printWriter.flush();
        String stringWriter2 = stringWriter.toString();
        C6562gT0.o(stringWriter2, "toString(...)");
        return stringWriter2;
    }

    public static /* synthetic */ void c(Throwable th) {
    }

    @InterfaceC6480g82(version = "1.4")
    public static /* synthetic */ void e(Throwable th) {
    }
}
