package o;

import java.nio.Buffer;

@InterfaceC7797la0
@InterfaceC11149zF0
/* renamed from: o.xU0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10723xU0 {
    public static void a(Buffer buffer) {
        buffer.clear();
    }

    public static void b(Buffer buffer) {
        buffer.flip();
    }

    public static void c(Buffer buffer, int i) {
        buffer.limit(i);
    }

    public static void d(Buffer buffer) {
        buffer.mark();
    }

    public static void e(Buffer buffer, int i) {
        buffer.position(i);
    }

    public static void f(Buffer buffer) {
        buffer.reset();
    }
}
