package o;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.logging.Logger;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import org.jetbrains.annotations.NotNull;

/* renamed from: o.tu1 */
/* loaded from: classes4.dex */
public final /* synthetic */ class C9847tu1 {
    public static final Logger a = Logger.getLogger("okio.Okio");

    @NotNull
    public static final J82 b(@NotNull File file) throws FileNotFoundException {
        C6562gT0.p(file, "<this>");
        return C9604su1.p(new FileOutputStream(file, true));
    }

    @NotNull
    public static final AbstractC2576Bp0 c(@NotNull ClassLoader classLoader) {
        C6562gT0.p(classLoader, "<this>");
        return new C8524oT1(classLoader, true, null, 4, null);
    }

    @NotNull
    public static final C8453oC d(@NotNull J82 j82, @NotNull Cipher cipher) {
        C6562gT0.p(j82, "<this>");
        C6562gT0.p(cipher, "cipher");
        return new C8453oC(C9604su1.d(j82), cipher);
    }

    @NotNull
    public static final C8697pC e(@NotNull InterfaceC7072ia2 interfaceC7072ia2, @NotNull Cipher cipher) {
        C6562gT0.p(interfaceC7072ia2, "<this>");
        C6562gT0.p(cipher, "cipher");
        return new C8697pC(C9604su1.e(interfaceC7072ia2), cipher);
    }

    @NotNull
    public static final HG0 f(@NotNull J82 j82, @NotNull MessageDigest messageDigest) {
        C6562gT0.p(j82, "<this>");
        C6562gT0.p(messageDigest, "digest");
        return new HG0(j82, messageDigest);
    }

    @NotNull
    public static final HG0 g(@NotNull J82 j82, @NotNull Mac mac) {
        C6562gT0.p(j82, "<this>");
        C6562gT0.p(mac, "mac");
        return new HG0(j82, mac);
    }

    @NotNull
    public static final IG0 h(@NotNull InterfaceC7072ia2 interfaceC7072ia2, @NotNull MessageDigest messageDigest) {
        C6562gT0.p(interfaceC7072ia2, "<this>");
        C6562gT0.p(messageDigest, "digest");
        return new IG0(interfaceC7072ia2, messageDigest);
    }

    @NotNull
    public static final IG0 i(@NotNull InterfaceC7072ia2 interfaceC7072ia2, @NotNull Mac mac) {
        C6562gT0.p(interfaceC7072ia2, "<this>");
        C6562gT0.p(mac, "mac");
        return new IG0(interfaceC7072ia2, mac);
    }

    public static final boolean j(@NotNull AssertionError assertionError) {
        boolean z;
        C6562gT0.p(assertionError, "<this>");
        if (assertionError.getCause() != null) {
            String message = assertionError.getMessage();
            if (message != null) {
                z = C10763xf2.n3(message, "getsockname failed", false, 2, null);
            } else {
                z = false;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public static final AbstractC2576Bp0 k(@NotNull AbstractC2576Bp0 abstractC2576Bp0, @NotNull C4972Zy1 c4972Zy1) throws IOException {
        C6562gT0.p(abstractC2576Bp0, "<this>");
        C6562gT0.p(c4972Zy1, "zipPath");
        return C7757lO2.e(c4972Zy1, abstractC2576Bp0, null, 4, null);
    }

    @InterfaceC8289nW0
    @NotNull
    public static final J82 l(@NotNull File file) throws FileNotFoundException {
        J82 q;
        C6562gT0.p(file, "<this>");
        q = q(file, false, 1, null);
        return q;
    }

    @InterfaceC8289nW0
    @NotNull
    public static final J82 m(@NotNull File file, boolean z) throws FileNotFoundException {
        C6562gT0.p(file, "<this>");
        return C9604su1.p(new FileOutputStream(file, z));
    }

    @NotNull
    public static final J82 n(@NotNull OutputStream outputStream) {
        C6562gT0.p(outputStream, "<this>");
        return new C5936dx1(outputStream, new C8120mp2());
    }

    @NotNull
    public static final J82 o(@NotNull Socket socket) throws IOException {
        C6562gT0.p(socket, "<this>");
        D92 d92 = new D92(socket);
        OutputStream outputStream = socket.getOutputStream();
        C6562gT0.o(outputStream, "getOutputStream(...)");
        return d92.sink(new C5936dx1(outputStream, d92));
    }

    @NotNull
    public static final J82 p(@NotNull Path path, @NotNull OpenOption... openOptionArr) throws IOException {
        OutputStream newOutputStream;
        C6562gT0.p(path, "<this>");
        C6562gT0.p(openOptionArr, C9998uW1.m0);
        newOutputStream = Files.newOutputStream(path, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
        C6562gT0.o(newOutputStream, "newOutputStream(...)");
        return C9604su1.p(newOutputStream);
    }

    public static /* synthetic */ J82 q(File file, boolean z, int i, Object obj) throws FileNotFoundException {
        if ((i & 1) != 0) {
            z = false;
        }
        return C9604su1.o(file, z);
    }

    @NotNull
    public static final InterfaceC7072ia2 r(@NotNull File file) throws FileNotFoundException {
        C6562gT0.p(file, "<this>");
        return new C8024mQ0(new FileInputStream(file), C8120mp2.NONE);
    }

    @NotNull
    public static final InterfaceC7072ia2 s(@NotNull InputStream inputStream) {
        C6562gT0.p(inputStream, "<this>");
        return new C8024mQ0(inputStream, new C8120mp2());
    }

    @NotNull
    public static final InterfaceC7072ia2 t(@NotNull Socket socket) throws IOException {
        C6562gT0.p(socket, "<this>");
        D92 d92 = new D92(socket);
        InputStream inputStream = socket.getInputStream();
        C6562gT0.o(inputStream, "getInputStream(...)");
        return d92.source(new C8024mQ0(inputStream, d92));
    }

    @NotNull
    public static final InterfaceC7072ia2 u(@NotNull Path path, @NotNull OpenOption... openOptionArr) throws IOException {
        InputStream newInputStream;
        C6562gT0.p(path, "<this>");
        C6562gT0.p(openOptionArr, C9998uW1.m0);
        newInputStream = Files.newInputStream(path, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
        C6562gT0.o(newInputStream, "newInputStream(...)");
        return C9604su1.u(newInputStream);
    }
}
