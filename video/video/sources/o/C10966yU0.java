package o;

import java.nio.Buffer;

@InterfaceC11149zF0
@InterfaceC8301na0
/* renamed from: o.yU0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10966yU0 {
    public static void a(Buffer buffer) {
        buffer.clear();
    }

    public static void b(Buffer buffer) {
        buffer.flip();
    }

    public static void c(Buffer buffer, int i) {
        buffer.limit(i);
    }

    public static void d(Buffer buffer, int i) {
        buffer.position(i);
    }
}
