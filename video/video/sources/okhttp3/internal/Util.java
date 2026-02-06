package okhttp3.internal;

import com.facebook.S;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.reflect.Field;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketTimeoutException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import o.AI0;
import o.AbstractC8515oR0;
import o.C10219vQ1;
import o.C10662xF;
import o.C10763xf2;
import o.C11197zR0;
import o.C11313zv2;
import o.C3599Ly1;
import o.C3917Pf0;
import o.C5033aE;
import o.C5075aO1;
import o.C5205aw1;
import o.C5422bq;
import o.C5663cp2;
import o.C6562gT0;
import o.C7330jf;
import o.C7458kA2;
import o.C8222nF;
import o.C8319ne2;
import o.C8466oF;
import o.C8859ps;
import o.C8926q81;
import o.C9046qe;
import o.C9545sf2;
import o.FA0;
import o.HA0;
import o.HB;
import o.InterfaceC2579Bq;
import o.InterfaceC2677Cq;
import o.InterfaceC7058iW0;
import o.InterfaceC7072ia2;
import o.InterfaceC8046mW0;
import o.InterfaceC8303na2;
import o.J82;
import o.JT;
import o.TD2;
import o.UP0;
import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.Util;
import okhttp3.internal.http2.Header;
import okhttp3.internal.io.FileSystem;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC8046mW0(name = TD2.g)
@InterfaceC8303na2({"SMAP\nUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Util.kt\nokhttp3/internal/Util\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,636:1\n37#2,2:637\n1627#3,6:639\n1#4:645\n1549#5:646\n1620#5,3:647\n*S KotlinDebug\n*F\n+ 1 Util.kt\nokhttp3/internal/Util\n*L\n127#1:637,2\n167#1:639,6\n300#1:646\n300#1:647,3\n*E\n"})
/* loaded from: classes4.dex */
public final class Util {
    @InterfaceC7058iW0
    @NotNull
    public static final byte[] EMPTY_BYTE_ARRAY;
    @InterfaceC7058iW0
    @NotNull
    public static final Headers EMPTY_HEADERS = Headers.Companion.of(new String[0]);
    @InterfaceC7058iW0
    @NotNull
    public static final RequestBody EMPTY_REQUEST;
    @InterfaceC7058iW0
    @NotNull
    public static final ResponseBody EMPTY_RESPONSE;
    @NotNull
    private static final C5205aw1 UNICODE_BOMS;
    @InterfaceC7058iW0
    @NotNull
    public static final TimeZone UTC;
    @NotNull
    private static final C10219vQ1 VERIFY_AS_IP_ADDRESS;
    @InterfaceC7058iW0
    public static final boolean assertionsEnabled;
    @InterfaceC7058iW0
    @NotNull
    public static final String okHttpName;
    @NotNull
    public static final String userAgent = "okhttp/4.12.0";

    static {
        byte[] bArr = new byte[0];
        EMPTY_BYTE_ARRAY = bArr;
        EMPTY_RESPONSE = ResponseBody.Companion.create$default(ResponseBody.Companion, bArr, (MediaType) null, 1, (Object) null);
        EMPTY_REQUEST = RequestBody.Companion.create$default(RequestBody.Companion, bArr, (MediaType) null, 0, 0, 7, (Object) null);
        C5205aw1.a aVar = C5205aw1.Z0;
        C8859ps.a aVar2 = C8859ps.Y0;
        UNICODE_BOMS = aVar.d(aVar2.i("efbbbf"), aVar2.i("feff"), aVar2.i("fffe"), aVar2.i("0000ffff"), aVar2.i("ffff0000"));
        TimeZone timeZone = TimeZone.getTimeZone(C5663cp2.a);
        C6562gT0.m(timeZone);
        UTC = timeZone;
        VERIFY_AS_IP_ADDRESS = new C10219vQ1("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
        assertionsEnabled = false;
        String name = OkHttpClient.class.getName();
        C6562gT0.o(name, "OkHttpClient::class.java.name");
        okHttpName = C10763xf2.D4(C10763xf2.x4(name, "okhttp3."), "Client");
    }

    public static final <E> void addIfAbsent(@NotNull List<E> list, E e) {
        C6562gT0.p(list, "<this>");
        if (!list.contains(e)) {
            list.add(e);
        }
    }

    public static final int and(byte b, int i) {
        return b & i;
    }

    @NotNull
    public static final EventListener.Factory asFactory(@NotNull final EventListener eventListener) {
        C6562gT0.p(eventListener, "<this>");
        return new EventListener.Factory() { // from class: o.LD2
            @Override // okhttp3.EventListener.Factory
            public final EventListener create(Call call) {
                EventListener asFactory$lambda$8;
                asFactory$lambda$8 = Util.asFactory$lambda$8(EventListener.this, call);
                return asFactory$lambda$8;
            }
        };
    }

    public static final EventListener asFactory$lambda$8(EventListener eventListener, Call call) {
        C6562gT0.p(eventListener, "$this_asFactory");
        C6562gT0.p(call, "it");
        return eventListener;
    }

    public static final void assertThreadDoesntHoldLock(@NotNull Object obj) {
        C6562gT0.p(obj, "<this>");
        if (assertionsEnabled && Thread.holdsLock(obj)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + obj);
        }
    }

    public static final void assertThreadHoldsLock(@NotNull Object obj) {
        C6562gT0.p(obj, "<this>");
        if (assertionsEnabled && !Thread.holdsLock(obj)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + obj);
        }
    }

    public static final boolean canParseAsIpAddress(@NotNull String str) {
        C6562gT0.p(str, "<this>");
        return VERIFY_AS_IP_ADDRESS.m(str);
    }

    public static final boolean canReuseConnectionFor(@NotNull HttpUrl httpUrl, @NotNull HttpUrl httpUrl2) {
        C6562gT0.p(httpUrl, "<this>");
        C6562gT0.p(httpUrl2, "other");
        if (C6562gT0.g(httpUrl.host(), httpUrl2.host()) && httpUrl.port() == httpUrl2.port() && C6562gT0.g(httpUrl.scheme(), httpUrl2.scheme())) {
            return true;
        }
        return false;
    }

    public static final int checkDuration(@NotNull String str, long j, @Nullable TimeUnit timeUnit) {
        C6562gT0.p(str, "name");
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i >= 0) {
            if (timeUnit != null) {
                long millis = timeUnit.toMillis(j);
                if (millis <= 2147483647L) {
                    if (millis == 0 && i > 0) {
                        throw new IllegalArgumentException((str + " too small.").toString());
                    }
                    return (int) millis;
                }
                throw new IllegalArgumentException((str + " too large.").toString());
            }
            throw new IllegalStateException("unit == null");
        }
        throw new IllegalStateException((str + " < 0").toString());
    }

    public static final void checkOffsetAndCount(long j, long j2, long j3) {
        if ((j2 | j3) >= 0 && j2 <= j && j - j2 >= j3) {
            return;
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public static final void closeQuietly(@NotNull Closeable closeable) {
        C6562gT0.p(closeable, "<this>");
        try {
            closeable.close();
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception unused) {
        }
    }

    @NotNull
    public static final String[] concat(@NotNull String[] strArr, @NotNull String str) {
        C6562gT0.p(strArr, "<this>");
        C6562gT0.p(str, "value");
        Object[] copyOf = Arrays.copyOf(strArr, strArr.length + 1);
        C6562gT0.o(copyOf, "copyOf(this, newSize)");
        String[] strArr2 = (String[]) copyOf;
        strArr2[C7330jf.Fe(strArr2)] = str;
        return strArr2;
    }

    public static final int delimiterOffset(@NotNull String str, @NotNull String str2, int i, int i2) {
        C6562gT0.p(str, "<this>");
        C6562gT0.p(str2, "delimiters");
        while (i < i2) {
            if (C10763xf2.m3(str2, str.charAt(i), false, 2, null)) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static /* synthetic */ int delimiterOffset$default(String str, String str2, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = str.length();
        }
        return delimiterOffset(str, str2, i, i2);
    }

    public static final boolean discard(@NotNull InterfaceC7072ia2 interfaceC7072ia2, int i, @NotNull TimeUnit timeUnit) {
        C6562gT0.p(interfaceC7072ia2, "<this>");
        C6562gT0.p(timeUnit, "timeUnit");
        try {
            return skipAll(interfaceC7072ia2, i, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    @NotNull
    public static final <T> List<T> filterList(@NotNull Iterable<? extends T> iterable, @NotNull HA0<? super T, Boolean> ha0) {
        C6562gT0.p(iterable, "<this>");
        C6562gT0.p(ha0, "predicate");
        List<T> H = C8222nF.H();
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            Object obj = (T) it.next();
            if (ha0.invoke(obj).booleanValue()) {
                if (H.isEmpty()) {
                    H = new ArrayList<>();
                }
                C6562gT0.n(H, "null cannot be cast to non-null type kotlin.collections.MutableList<T of okhttp3.internal.Util.filterList>");
                C11313zv2.g(H).add(obj);
            }
        }
        return H;
    }

    @NotNull
    public static final String format(@NotNull String str, @NotNull Object... objArr) {
        C6562gT0.p(str, S.A);
        C6562gT0.p(objArr, "args");
        C8319ne2 c8319ne2 = C8319ne2.a;
        Locale locale = Locale.US;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        String format = String.format(locale, str, Arrays.copyOf(copyOf, copyOf.length));
        C6562gT0.o(format, "format(locale, format, *args)");
        return format;
    }

    public static final boolean hasIntersection(@NotNull String[] strArr, @Nullable String[] strArr2, @NotNull Comparator<? super String> comparator) {
        C6562gT0.p(strArr, "<this>");
        C6562gT0.p(comparator, "comparator");
        if (strArr.length != 0 && strArr2 != null && strArr2.length != 0) {
            for (String str : strArr) {
                Iterator a = C9046qe.a(strArr2);
                while (a.hasNext()) {
                    if (comparator.compare(str, (String) a.next()) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final long headersContentLength(@NotNull Response response) {
        C6562gT0.p(response, "<this>");
        String str = response.headers().get("Content-Length");
        if (str == null) {
            return -1L;
        }
        return toLongOrDefault(str, -1L);
    }

    public static final void ignoreIoExceptions(@NotNull FA0<C7458kA2> fa0) {
        C6562gT0.p(fa0, "block");
        try {
            fa0.invoke();
        } catch (IOException unused) {
        }
    }

    @SafeVarargs
    @NotNull
    public static final <T> List<T> immutableListOf(@NotNull T... tArr) {
        C6562gT0.p(tArr, "elements");
        Object[] objArr = (Object[]) tArr.clone();
        List<T> unmodifiableList = Collections.unmodifiableList(C8222nF.O(Arrays.copyOf(objArr, objArr.length)));
        C6562gT0.o(unmodifiableList, "unmodifiableList(listOf(*elements.clone()))");
        return unmodifiableList;
    }

    public static final int indexOf(@NotNull String[] strArr, @NotNull String str, @NotNull Comparator<String> comparator) {
        C6562gT0.p(strArr, "<this>");
        C6562gT0.p(str, "value");
        C6562gT0.p(comparator, "comparator");
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            if (comparator.compare(strArr[i], str) == 0) {
                return i;
            }
        }
        return -1;
    }

    public static final int indexOfControlOrNonAscii(@NotNull String str) {
        C6562gT0.p(str, "<this>");
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (C6562gT0.t(charAt, 31) <= 0 || C6562gT0.t(charAt, 127) >= 0) {
                return i;
            }
        }
        return -1;
    }

    public static final int indexOfFirstNonAsciiWhitespace(@NotNull String str, int i, int i2) {
        C6562gT0.p(str, "<this>");
        while (i < i2) {
            char charAt = str.charAt(i);
            if (charAt == '\t' || charAt == '\n' || charAt == '\f' || charAt == '\r' || charAt == ' ') {
                i++;
            } else {
                return i;
            }
        }
        return i2;
    }

    public static /* synthetic */ int indexOfFirstNonAsciiWhitespace$default(String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        return indexOfFirstNonAsciiWhitespace(str, i, i2);
    }

    public static final int indexOfLastNonAsciiWhitespace(@NotNull String str, int i, int i2) {
        C6562gT0.p(str, "<this>");
        int i3 = i2 - 1;
        if (i <= i3) {
            while (true) {
                char charAt = str.charAt(i3);
                if (charAt == '\t' || charAt == '\n' || charAt == '\f' || charAt == '\r' || charAt == ' ') {
                    if (i3 == i) {
                        break;
                    }
                    i3--;
                } else {
                    return i3 + 1;
                }
            }
        }
        return i;
    }

    public static /* synthetic */ int indexOfLastNonAsciiWhitespace$default(String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        return indexOfLastNonAsciiWhitespace(str, i, i2);
    }

    public static final int indexOfNonWhitespace(@NotNull String str, int i) {
        C6562gT0.p(str, "<this>");
        int length = str.length();
        while (i < length) {
            char charAt = str.charAt(i);
            if (charAt != ' ' && charAt != '\t') {
                return i;
            }
            i++;
        }
        return str.length();
    }

    public static /* synthetic */ int indexOfNonWhitespace$default(String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return indexOfNonWhitespace(str, i);
    }

    @NotNull
    public static final String[] intersect(@NotNull String[] strArr, @NotNull String[] strArr2, @NotNull Comparator<? super String> comparator) {
        C6562gT0.p(strArr, "<this>");
        C6562gT0.p(strArr2, "other");
        C6562gT0.p(comparator, "comparator");
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = strArr2.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if (comparator.compare(str, strArr2[i]) == 0) {
                    arrayList.add(str);
                    break;
                } else {
                    i++;
                }
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static final boolean isCivilized(@NotNull FileSystem fileSystem, @NotNull File file) {
        C6562gT0.p(fileSystem, "<this>");
        C6562gT0.p(file, "file");
        J82 sink = fileSystem.sink(file);
        try {
            try {
                fileSystem.delete(file);
                C5033aE.a(sink, null);
                return true;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    C5033aE.a(sink, th);
                    throw th2;
                }
            }
        } catch (IOException unused) {
            C7458kA2 c7458kA2 = C7458kA2.a;
            C5033aE.a(sink, null);
            fileSystem.delete(file);
            return false;
        }
    }

    public static final boolean isHealthy(@NotNull Socket socket, @NotNull InterfaceC2677Cq interfaceC2677Cq) {
        C6562gT0.p(socket, "<this>");
        C6562gT0.p(interfaceC2677Cq, "source");
        try {
            int soTimeout = socket.getSoTimeout();
            try {
                socket.setSoTimeout(1);
                return !interfaceC2677Cq.M3();
            } finally {
                socket.setSoTimeout(soTimeout);
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    public static final boolean isSensitiveHeader(@NotNull String str) {
        C6562gT0.p(str, "name");
        if (C9545sf2.c2(str, "Authorization", true) || C9545sf2.c2(str, "Cookie", true) || C9545sf2.c2(str, AI0.H, true) || C9545sf2.c2(str, AI0.E0, true)) {
            return true;
        }
        return false;
    }

    public static final void notify(@NotNull Object obj) {
        C6562gT0.p(obj, "<this>");
        obj.notify();
    }

    public static final void notifyAll(@NotNull Object obj) {
        C6562gT0.p(obj, "<this>");
        obj.notifyAll();
    }

    public static final int parseHexDigit(char c) {
        if ('0' > c || c >= ':') {
            if ('a' > c || c >= 'g') {
                if ('A' > c || c >= 'G') {
                    return -1;
                }
                return c - '7';
            }
            return c - 'W';
        }
        return c - C3599Ly1.j;
    }

    @NotNull
    public static final String peerName(@NotNull Socket socket) {
        C6562gT0.p(socket, "<this>");
        SocketAddress remoteSocketAddress = socket.getRemoteSocketAddress();
        if (remoteSocketAddress instanceof InetSocketAddress) {
            String hostName = ((InetSocketAddress) remoteSocketAddress).getHostName();
            C6562gT0.o(hostName, "address.hostName");
            return hostName;
        }
        return remoteSocketAddress.toString();
    }

    @NotNull
    public static final Charset readBomAsCharset(@NotNull InterfaceC2677Cq interfaceC2677Cq, @NotNull Charset charset) throws IOException {
        C6562gT0.p(interfaceC2677Cq, "<this>");
        C6562gT0.p(charset, JT.d);
        int I5 = interfaceC2677Cq.I5(UNICODE_BOMS);
        if (I5 != -1) {
            if (I5 != 0) {
                if (I5 != 1) {
                    if (I5 != 2) {
                        if (I5 != 3) {
                            if (I5 == 4) {
                                return HB.a.c();
                            }
                            throw new AssertionError();
                        }
                        return HB.a.b();
                    }
                    Charset charset2 = StandardCharsets.UTF_16LE;
                    C6562gT0.o(charset2, "UTF_16LE");
                    return charset2;
                }
                Charset charset3 = StandardCharsets.UTF_16BE;
                C6562gT0.o(charset3, "UTF_16BE");
                return charset3;
            }
            Charset charset4 = StandardCharsets.UTF_8;
            C6562gT0.o(charset4, "UTF_8");
            return charset4;
        }
        return charset;
    }

    @Nullable
    public static final <T> T readFieldOrNull(@NotNull Object obj, @NotNull Class<T> cls, @NotNull String str) {
        T t;
        Object readFieldOrNull;
        C6562gT0.p(obj, "instance");
        C6562gT0.p(cls, "fieldType");
        C6562gT0.p(str, "fieldName");
        Class<?> cls2 = obj.getClass();
        while (true) {
            t = null;
            if (!C6562gT0.g(cls2, Object.class)) {
                try {
                    Field declaredField = cls2.getDeclaredField(str);
                    declaredField.setAccessible(true);
                    Object obj2 = declaredField.get(obj);
                    if (!cls.isInstance(obj2)) {
                        break;
                    }
                    t = cls.cast(obj2);
                    break;
                } catch (NoSuchFieldException unused) {
                    cls2 = cls2.getSuperclass();
                    C6562gT0.o(cls2, "c.superclass");
                }
            } else if (C6562gT0.g(str, "delegate") || (readFieldOrNull = readFieldOrNull(obj, Object.class, "delegate")) == null) {
                return null;
            } else {
                return (T) readFieldOrNull(readFieldOrNull, cls, str);
            }
        }
        return t;
    }

    public static final int readMedium(@NotNull InterfaceC2677Cq interfaceC2677Cq) throws IOException {
        C6562gT0.p(interfaceC2677Cq, "<this>");
        return and(interfaceC2677Cq.readByte(), 255) | (and(interfaceC2677Cq.readByte(), 255) << 16) | (and(interfaceC2677Cq.readByte(), 255) << 8);
    }

    public static final boolean skipAll(@NotNull InterfaceC7072ia2 interfaceC7072ia2, int i, @NotNull TimeUnit timeUnit) throws IOException {
        C6562gT0.p(interfaceC7072ia2, "<this>");
        C6562gT0.p(timeUnit, "timeUnit");
        long nanoTime = System.nanoTime();
        long deadlineNanoTime = interfaceC7072ia2.timeout().hasDeadline() ? interfaceC7072ia2.timeout().deadlineNanoTime() - nanoTime : Long.MAX_VALUE;
        interfaceC7072ia2.timeout().deadlineNanoTime(Math.min(deadlineNanoTime, timeUnit.toNanos(i)) + nanoTime);
        try {
            C5422bq c5422bq = new C5422bq();
            while (interfaceC7072ia2.read(c5422bq, 8192L) != -1) {
                c5422bq.h();
            }
            if (deadlineNanoTime == Long.MAX_VALUE) {
                interfaceC7072ia2.timeout().clearDeadline();
                return true;
            }
            interfaceC7072ia2.timeout().deadlineNanoTime(nanoTime + deadlineNanoTime);
            return true;
        } catch (InterruptedIOException unused) {
            if (deadlineNanoTime == Long.MAX_VALUE) {
                interfaceC7072ia2.timeout().clearDeadline();
                return false;
            }
            interfaceC7072ia2.timeout().deadlineNanoTime(nanoTime + deadlineNanoTime);
            return false;
        } catch (Throwable th) {
            if (deadlineNanoTime == Long.MAX_VALUE) {
                interfaceC7072ia2.timeout().clearDeadline();
            } else {
                interfaceC7072ia2.timeout().deadlineNanoTime(nanoTime + deadlineNanoTime);
            }
            throw th;
        }
    }

    @NotNull
    public static final ThreadFactory threadFactory(@NotNull final String str, final boolean z) {
        C6562gT0.p(str, "name");
        return new ThreadFactory() { // from class: o.MD2
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                Thread threadFactory$lambda$1;
                threadFactory$lambda$1 = Util.threadFactory$lambda$1(str, z, runnable);
                return threadFactory$lambda$1;
            }
        };
    }

    public static final Thread threadFactory$lambda$1(String str, boolean z, Runnable runnable) {
        C6562gT0.p(str, "$name");
        Thread thread = new Thread(runnable, str);
        thread.setDaemon(z);
        return thread;
    }

    public static final void threadName(@NotNull String str, @NotNull FA0<C7458kA2> fa0) {
        C6562gT0.p(str, "name");
        C6562gT0.p(fa0, "block");
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        currentThread.setName(str);
        try {
            fa0.invoke();
        } finally {
            UP0.d(1);
            currentThread.setName(name);
            UP0.c(1);
        }
    }

    @NotNull
    public static final List<Header> toHeaderList(@NotNull Headers headers) {
        C6562gT0.p(headers, "<this>");
        C11197zR0 W1 = C5075aO1.W1(0, headers.size());
        ArrayList arrayList = new ArrayList(C8466oF.b0(W1, 10));
        Iterator<Integer> it = W1.iterator();
        while (it.hasNext()) {
            int nextInt = ((AbstractC8515oR0) it).nextInt();
            arrayList.add(new Header(headers.name(nextInt), headers.value(nextInt)));
        }
        return arrayList;
    }

    @NotNull
    public static final Headers toHeaders(@NotNull List<Header> list) {
        C6562gT0.p(list, "<this>");
        Headers.Builder builder = new Headers.Builder();
        for (Header header : list) {
            builder.addLenient$okhttp(header.component1().s0(), header.component2().s0());
        }
        return builder.build();
    }

    @NotNull
    public static final String toHexString(long j) {
        String hexString = Long.toHexString(j);
        C6562gT0.o(hexString, "toHexString(this)");
        return hexString;
    }

    @NotNull
    public static final String toHostHeader(@NotNull HttpUrl httpUrl, boolean z) {
        String host;
        C6562gT0.p(httpUrl, "<this>");
        if (C10763xf2.n3(httpUrl.host(), ":", false, 2, null)) {
            host = '[' + httpUrl.host() + ']';
        } else {
            host = httpUrl.host();
        }
        if (!z && httpUrl.port() == HttpUrl.Companion.defaultPort(httpUrl.scheme())) {
            return host;
        }
        return host + ':' + httpUrl.port();
    }

    public static /* synthetic */ String toHostHeader$default(HttpUrl httpUrl, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return toHostHeader(httpUrl, z);
    }

    @NotNull
    public static final <T> List<T> toImmutableList(@NotNull List<? extends T> list) {
        C6562gT0.p(list, "<this>");
        List<T> unmodifiableList = Collections.unmodifiableList(C10662xF.b6(list));
        C6562gT0.o(unmodifiableList, "unmodifiableList(toMutableList())");
        return unmodifiableList;
    }

    @NotNull
    public static final <K, V> Map<K, V> toImmutableMap(@NotNull Map<K, ? extends V> map) {
        C6562gT0.p(map, "<this>");
        if (map.isEmpty()) {
            return C8926q81.z();
        }
        Map<K, V> unmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(map));
        C6562gT0.o(unmodifiableMap, "{\n    Collections.unmodi…(LinkedHashMap(this))\n  }");
        return unmodifiableMap;
    }

    public static final long toLongOrDefault(@NotNull String str, long j) {
        C6562gT0.p(str, "<this>");
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return j;
        }
    }

    public static final int toNonNegativeInt(@Nullable String str, int i) {
        if (str != null) {
            try {
                long parseLong = Long.parseLong(str);
                if (parseLong > 2147483647L) {
                    return Integer.MAX_VALUE;
                }
                if (parseLong < 0) {
                    return 0;
                }
                return (int) parseLong;
            } catch (NumberFormatException unused) {
            }
        }
        return i;
    }

    @NotNull
    public static final String trimSubstring(@NotNull String str, int i, int i2) {
        C6562gT0.p(str, "<this>");
        int indexOfFirstNonAsciiWhitespace = indexOfFirstNonAsciiWhitespace(str, i, i2);
        String substring = str.substring(indexOfFirstNonAsciiWhitespace, indexOfLastNonAsciiWhitespace(str, indexOfFirstNonAsciiWhitespace, i2));
        C6562gT0.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static /* synthetic */ String trimSubstring$default(String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        return trimSubstring(str, i, i2);
    }

    public static final void wait(@NotNull Object obj) {
        C6562gT0.p(obj, "<this>");
        obj.wait();
    }

    @NotNull
    public static final Throwable withSuppressed(@NotNull Exception exc, @NotNull List<? extends Exception> list) {
        C6562gT0.p(exc, "<this>");
        C6562gT0.p(list, "suppressed");
        for (Exception exc2 : list) {
            C3917Pf0.a(exc, exc2);
        }
        return exc;
    }

    public static final void writeMedium(@NotNull InterfaceC2579Bq interfaceC2579Bq, int i) throws IOException {
        C6562gT0.p(interfaceC2579Bq, "<this>");
        interfaceC2579Bq.writeByte((i >>> 16) & 255);
        interfaceC2579Bq.writeByte((i >>> 8) & 255);
        interfaceC2579Bq.writeByte(i & 255);
    }

    public static final int and(short s, int i) {
        return s & i;
    }

    public static final int delimiterOffset(@NotNull String str, char c, int i, int i2) {
        C6562gT0.p(str, "<this>");
        while (i < i2) {
            if (str.charAt(i) == c) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static /* synthetic */ int delimiterOffset$default(String str, char c, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = str.length();
        }
        return delimiterOffset(str, c, i, i2);
    }

    @NotNull
    public static final String toHexString(int i) {
        String hexString = Integer.toHexString(i);
        C6562gT0.o(hexString, "toHexString(this)");
        return hexString;
    }

    public static final long and(int i, long j) {
        return i & j;
    }

    public static final void closeQuietly(@NotNull Socket socket) {
        C6562gT0.p(socket, "<this>");
        try {
            socket.close();
        } catch (AssertionError e) {
            throw e;
        } catch (RuntimeException e2) {
            if (!C6562gT0.g(e2.getMessage(), "bio == null")) {
                throw e2;
            }
        } catch (Exception unused) {
        }
    }

    public static final void closeQuietly(@NotNull ServerSocket serverSocket) {
        C6562gT0.p(serverSocket, "<this>");
        try {
            serverSocket.close();
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception unused) {
        }
    }

    public static final int skipAll(@NotNull C5422bq c5422bq, byte b) {
        C6562gT0.p(c5422bq, "<this>");
        int i = 0;
        while (!c5422bq.M3() && c5422bq.x(0L) == b) {
            i++;
            c5422bq.readByte();
        }
        return i;
    }
}
