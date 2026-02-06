package o;

import android.os.Message;

/* renamed from: o.Di1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2745Di1 {
    public static boolean a = true;
    public static boolean b = true;

    /* renamed from: o.Di1$a */
    /* loaded from: classes.dex */
    public static class a {
        public static boolean a(Message message) {
            return message.isAsynchronous();
        }

        public static void b(Message message, boolean z) {
            message.setAsynchronous(z);
        }
    }

    public static boolean a(Message message) {
        return a.a(message);
    }

    public static void b(Message message, boolean z) {
        a.b(message, z);
    }
}
