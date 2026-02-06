package o;

import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;

@InterfaceC9150r20(message = "changed in Okio 2.x")
/* renamed from: o.e  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5946e {
    @NotNull
    public static final C5946e a = new C5946e();

    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "moved to extension function", replaceWith = @IR1(expression = "file.appendingSink()", imports = {"okio.appendingSink"}))
    @NotNull
    public final J82 a(@NotNull File file) {
        C6562gT0.p(file, "file");
        return C9604su1.a(file);
    }

    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "moved to extension function", replaceWith = @IR1(expression = "blackholeSink()", imports = {"okio.blackholeSink"}))
    @NotNull
    public final J82 b() {
        return C9604su1.c();
    }

    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "moved to extension function", replaceWith = @IR1(expression = "sink.buffer()", imports = {"okio.buffer"}))
    @NotNull
    public final InterfaceC2579Bq c(@NotNull J82 j82) {
        C6562gT0.p(j82, "sink");
        return C9604su1.d(j82);
    }

    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "moved to extension function", replaceWith = @IR1(expression = "source.buffer()", imports = {"okio.buffer"}))
    @NotNull
    public final InterfaceC2677Cq d(@NotNull InterfaceC7072ia2 interfaceC7072ia2) {
        C6562gT0.p(interfaceC7072ia2, "source");
        return C9604su1.e(interfaceC7072ia2);
    }

    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "moved to extension function", replaceWith = @IR1(expression = "file.sink()", imports = {"okio.sink"}))
    @NotNull
    public final J82 e(@NotNull File file) {
        J82 q;
        C6562gT0.p(file, "file");
        q = C9847tu1.q(file, false, 1, null);
        return q;
    }

    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "moved to extension function", replaceWith = @IR1(expression = "outputStream.sink()", imports = {"okio.sink"}))
    @NotNull
    public final J82 f(@NotNull OutputStream outputStream) {
        C6562gT0.p(outputStream, "outputStream");
        return C9604su1.p(outputStream);
    }

    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "moved to extension function", replaceWith = @IR1(expression = "socket.sink()", imports = {"okio.sink"}))
    @NotNull
    public final J82 g(@NotNull Socket socket) {
        C6562gT0.p(socket, "socket");
        return C9604su1.q(socket);
    }

    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "moved to extension function", replaceWith = @IR1(expression = "path.sink(*options)", imports = {"okio.sink"}))
    @NotNull
    public final J82 h(@NotNull Path path, @NotNull OpenOption... openOptionArr) {
        C6562gT0.p(path, "path");
        C6562gT0.p(openOptionArr, C9998uW1.m0);
        return C9604su1.r(path, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
    }

    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "moved to extension function", replaceWith = @IR1(expression = "file.source()", imports = {"okio.source"}))
    @NotNull
    public final InterfaceC7072ia2 i(@NotNull File file) {
        C6562gT0.p(file, "file");
        return C9604su1.t(file);
    }

    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "moved to extension function", replaceWith = @IR1(expression = "inputStream.source()", imports = {"okio.source"}))
    @NotNull
    public final InterfaceC7072ia2 j(@NotNull InputStream inputStream) {
        C6562gT0.p(inputStream, "inputStream");
        return C9604su1.u(inputStream);
    }

    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "moved to extension function", replaceWith = @IR1(expression = "socket.source()", imports = {"okio.source"}))
    @NotNull
    public final InterfaceC7072ia2 k(@NotNull Socket socket) {
        C6562gT0.p(socket, "socket");
        return C9604su1.v(socket);
    }

    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "moved to extension function", replaceWith = @IR1(expression = "path.source(*options)", imports = {"okio.source"}))
    @NotNull
    public final InterfaceC7072ia2 l(@NotNull Path path, @NotNull OpenOption... openOptionArr) {
        C6562gT0.p(path, "path");
        C6562gT0.p(openOptionArr, C9998uW1.m0);
        return C9604su1.w(path, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
    }
}
