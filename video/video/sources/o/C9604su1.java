package o;

import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.security.MessageDigest;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import org.jetbrains.annotations.NotNull;

/* renamed from: o.su1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C9604su1 {
    @NotNull
    public static final J82 a(@NotNull File file) throws FileNotFoundException {
        return C9847tu1.b(file);
    }

    @NotNull
    public static final AbstractC2576Bp0 b(@NotNull ClassLoader classLoader) {
        return C9847tu1.c(classLoader);
    }

    @InterfaceC8046mW0(name = "blackhole")
    @NotNull
    public static final J82 c() {
        return C10090uu1.a();
    }

    @NotNull
    public static final InterfaceC2579Bq d(@NotNull J82 j82) {
        return C10090uu1.b(j82);
    }

    @NotNull
    public static final InterfaceC2677Cq e(@NotNull InterfaceC7072ia2 interfaceC7072ia2) {
        return C10090uu1.c(interfaceC7072ia2);
    }

    @NotNull
    public static final C8453oC f(@NotNull J82 j82, @NotNull Cipher cipher) {
        return C9847tu1.d(j82, cipher);
    }

    @NotNull
    public static final C8697pC g(@NotNull InterfaceC7072ia2 interfaceC7072ia2, @NotNull Cipher cipher) {
        return C9847tu1.e(interfaceC7072ia2, cipher);
    }

    @NotNull
    public static final HG0 h(@NotNull J82 j82, @NotNull MessageDigest messageDigest) {
        return C9847tu1.f(j82, messageDigest);
    }

    @NotNull
    public static final HG0 i(@NotNull J82 j82, @NotNull Mac mac) {
        return C9847tu1.g(j82, mac);
    }

    @NotNull
    public static final IG0 j(@NotNull InterfaceC7072ia2 interfaceC7072ia2, @NotNull MessageDigest messageDigest) {
        return C9847tu1.h(interfaceC7072ia2, messageDigest);
    }

    @NotNull
    public static final IG0 k(@NotNull InterfaceC7072ia2 interfaceC7072ia2, @NotNull Mac mac) {
        return C9847tu1.i(interfaceC7072ia2, mac);
    }

    public static final boolean l(@NotNull AssertionError assertionError) {
        return C9847tu1.j(assertionError);
    }

    @NotNull
    public static final AbstractC2576Bp0 m(@NotNull AbstractC2576Bp0 abstractC2576Bp0, @NotNull C4972Zy1 c4972Zy1) throws IOException {
        return C9847tu1.k(abstractC2576Bp0, c4972Zy1);
    }

    @InterfaceC8289nW0
    @NotNull
    public static final J82 n(@NotNull File file) throws FileNotFoundException {
        return C9847tu1.l(file);
    }

    @InterfaceC8289nW0
    @NotNull
    public static final J82 o(@NotNull File file, boolean z) throws FileNotFoundException {
        return C9847tu1.m(file, z);
    }

    @NotNull
    public static final J82 p(@NotNull OutputStream outputStream) {
        return C9847tu1.n(outputStream);
    }

    @NotNull
    public static final J82 q(@NotNull Socket socket) throws IOException {
        return C9847tu1.o(socket);
    }

    @NotNull
    public static final J82 r(@NotNull Path path, @NotNull OpenOption... openOptionArr) throws IOException {
        return C9847tu1.p(path, openOptionArr);
    }

    @NotNull
    public static final InterfaceC7072ia2 t(@NotNull File file) throws FileNotFoundException {
        return C9847tu1.r(file);
    }

    @NotNull
    public static final InterfaceC7072ia2 u(@NotNull InputStream inputStream) {
        return C9847tu1.s(inputStream);
    }

    @NotNull
    public static final InterfaceC7072ia2 v(@NotNull Socket socket) throws IOException {
        return C9847tu1.t(socket);
    }

    @NotNull
    public static final InterfaceC7072ia2 w(@NotNull Path path, @NotNull OpenOption... openOptionArr) throws IOException {
        return C9847tu1.u(path, openOptionArr);
    }

    public static final <T extends Closeable, R> R x(T t, @NotNull HA0<? super T, ? extends R> ha0) {
        return (R) C10090uu1.d(t, ha0);
    }
}
