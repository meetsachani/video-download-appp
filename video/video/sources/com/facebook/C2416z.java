package com.facebook;

import com.facebook.internal.C2375u;
import java.util.Arrays;
import java.util.Random;
import o.C6562gT0;
import o.C9516sY;
import o.C9539se0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.facebook.z */
/* loaded from: classes2.dex */
public class C2416z extends RuntimeException {
    @NotNull
    public static final a X = new a(null);
    public static final long serialVersionUID = 1;

    /* renamed from: com.facebook.z$a */
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C9516sY c9516sY) {
            this();
        }

        public a() {
        }
    }

    public C2416z() {
    }

    public static /* synthetic */ void a(String str, boolean z) {
        b(str, z);
    }

    public static final void b(String str, boolean z) {
        if (z) {
            try {
                C9539se0 c9539se0 = C9539se0.a;
                C9539se0.g(str);
            } catch (Exception unused) {
            }
        }
    }

    @Override // java.lang.Throwable
    @NotNull
    public String toString() {
        String message = getMessage();
        if (message == null) {
            return "";
        }
        return message;
    }

    public C2416z(@Nullable final String str) {
        super(str);
        Random random = new Random();
        if (str != null) {
            M m = M.a;
            if (!M.N() || random.nextInt(100) <= 50) {
                return;
            }
            C2375u c2375u = C2375u.a;
            C2375u.a(C2375u.b.ErrorReport, new C2375u.a() { // from class: com.facebook.y
                @Override // com.facebook.internal.C2375u.a
                public final void a(boolean z) {
                    C2416z.a(str, z);
                }
            });
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C2416z(@Nullable String str, @NotNull Object... objArr) {
        this(r2);
        String format;
        C6562gT0.p(objArr, "args");
        if (str == null) {
            format = null;
        } else {
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            format = String.format(str, Arrays.copyOf(copyOf, copyOf.length));
            C6562gT0.o(format, "java.lang.String.format(this, *args)");
        }
    }

    public C2416z(@Nullable String str, @Nullable Throwable th) {
        super(str, th);
    }

    public C2416z(@Nullable Throwable th) {
        super(th);
    }
}
