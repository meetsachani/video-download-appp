package o;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Base64;
import android.util.Log;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import o.RP1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: o.yG0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10910yG0 {
    @NotNull
    public static final String b = "MD5";
    public static final int c = 1024;
    @NotNull
    public static final C10910yG0 a = new C10910yG0();
    public static final String d = C10910yG0.class.getSimpleName();
    @NotNull
    public static final String[] e = {"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"};

    /* renamed from: o.yG0$a */
    /* loaded from: classes2.dex */
    public static final class a implements InvocationHandler {
        public final /* synthetic */ Object a;
        public final /* synthetic */ RP1.h<String> b;
        public final /* synthetic */ ReentrantLock c;
        public final /* synthetic */ Condition d;

        public a(Object obj, RP1.h<String> hVar, ReentrantLock reentrantLock, Condition condition) {
            this.a = obj;
            this.b = hVar;
            this.c = reentrantLock;
            this.d = condition;
        }

        /* JADX WARN: Type inference failed for: r6v15, types: [T, java.lang.String] */
        @Override // java.lang.reflect.InvocationHandler
        @Nullable
        public Object invoke(@Nullable Object obj, @NotNull Method method, @NotNull Object[] objArr) {
            C6562gT0.p(method, "method");
            C6562gT0.p(objArr, "objects");
            try {
                if (C6562gT0.g(method.getName(), "onChecksumsReady") && objArr.length == 1) {
                    Object obj2 = objArr[0];
                    if (obj2 instanceof List) {
                        for (Object obj3 : (List) obj2) {
                            if (obj3 != null) {
                                Method method2 = obj3.getClass().getMethod("getSplitName", null);
                                C6562gT0.o(method2, "c.javaClass.getMethod(\"getSplitName\")");
                                Method method3 = obj3.getClass().getMethod("getType", null);
                                C6562gT0.o(method3, "c.javaClass.getMethod(\"getType\")");
                                if (method2.invoke(obj3, null) == null && C6562gT0.g(method3.invoke(obj3, null), this.a)) {
                                    Method method4 = obj3.getClass().getMethod("getValue", null);
                                    C6562gT0.o(method4, "c.javaClass.getMethod(\"getValue\")");
                                    Object invoke = method4.invoke(obj3, null);
                                    if (invoke != null) {
                                        this.b.X = new BigInteger(1, (byte[]) invoke).toString(16);
                                        this.c.lock();
                                        this.d.signalAll();
                                        this.c.unlock();
                                        return null;
                                    }
                                    throw new NullPointerException("null cannot be cast to non-null type kotlin.ByteArray");
                                }
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                Log.d(C10910yG0.d, "Can't fetch checksum.", th);
            }
            return null;
        }
    }

    @InterfaceC9511sW0
    @NotNull
    public static final String b(@Nullable String str) throws Exception {
        return a.d(new File(str));
    }

    @InterfaceC9511sW0
    @Nullable
    public static final String c(@NotNull Context context, @Nullable Long l) {
        C6562gT0.p(context, "context");
        CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
        String[] strArr = e;
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(Base64.decode(str, 0))));
        }
        List b6 = C10662xF.b6(arrayList);
        RP1.h hVar = new RP1.h();
        ReentrantLock reentrantLock = new ReentrantLock();
        Condition newCondition = reentrantLock.newCondition();
        reentrantLock.lock();
        try {
            Field field = Class.forName("android.content.pm.Checksum").getField("TYPE_WHOLE_MD5");
            C6562gT0.o(field, "checksumClass.getField(\"TYPE_WHOLE_MD5\")");
            Object obj = field.get(null);
            Class<?> cls = Class.forName("android.content.pm.PackageManager$OnChecksumsReadyListener");
            Object newProxyInstance = Proxy.newProxyInstance(C10910yG0.class.getClassLoader(), new Class[]{cls}, new a(obj, hVar, reentrantLock, newCondition));
            C6562gT0.o(newProxyInstance, "var resultChecksum: String? = null\n    val lock = ReentrantLock()\n    val checksumReady = lock.newCondition()\n    lock.lock()\n\n    try {\n      val checksumClass = Class.forName(\"android.content.pm.Checksum\")\n      val typeWholeMd5Field: Field = checksumClass.getField(\"TYPE_WHOLE_MD5\")\n      val TYPE_WHOLE_MD5 = typeWholeMd5Field.get(null)\n      val checksumReadyListenerClass =\n          Class.forName(\"android.content.pm.PackageManager\\$OnChecksumsReadyListener\")\n      val listener: Any =\n          Proxy.newProxyInstance(\n              HashUtils::class.java.classLoader,\n              arrayOf(checksumReadyListenerClass),\n              object : InvocationHandler {\n                override operator fun invoke(o: Any?, method: Method, objects: Array<Any>): Any? {\n                  try {\n                    if (method.name == \"onChecksumsReady\" &&\n                        objects.size == 1 &&\n                        objects[0] is List<*>) {\n                      val list = objects[0] as List<*>\n                      for (c in list) {\n                        if (c != null) {\n                          val getSplitNameMethod: Method = c.javaClass.getMethod(\"getSplitName\")\n                          val getTypeMethod: Method = c.javaClass.getMethod(\"getType\")\n                          if (getSplitNameMethod.invoke(c) == null &&\n                              getTypeMethod.invoke(c) == TYPE_WHOLE_MD5) {\n                            val getValueMethod: Method = c.javaClass.getMethod(\"getValue\")\n                            val checksumValue = getValueMethod.invoke(c) as ByteArray\n                            resultChecksum = BigInteger(1, checksumValue).toString(16)\n                            lock.lock()\n                            try {\n                              checksumReady.signalAll()\n                            } finally {\n                              lock.unlock()\n                            }\n                            return null\n                          }\n                        }\n                      }\n                    }\n                  } catch (t: Throwable) {\n                    Log.d(TAG, \"Can't fetch checksum.\", t)\n                  }\n                  return null\n                }\n              })");
            Method method = PackageManager.class.getMethod("requestChecksums", String.class, Boolean.TYPE, Integer.TYPE, List.class, cls);
            C6562gT0.o(method, "PackageManager::class\n              .java\n              .getMethod(\n                  \"requestChecksums\",\n                  String::class.java,\n                  Boolean::class.javaPrimitiveType,\n                  Int::class.javaPrimitiveType,\n                  MutableList::class.java,\n                  checksumReadyListenerClass)");
            method.invoke(context.getPackageManager(), context.getPackageName(), Boolean.FALSE, obj, C10662xF.b6(b6), newProxyInstance);
            if (l == null) {
                newCondition.await();
            } else {
                newCondition.awaitNanos(l.longValue());
            }
            String str2 = (String) hVar.X;
            reentrantLock.unlock();
            return str2;
        } catch (Throwable unused) {
            reentrantLock.unlock();
            return null;
        }
    }

    public final String d(File file) throws Exception {
        int read;
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file), 1024);
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            byte[] bArr = new byte[1024];
            do {
                read = bufferedInputStream.read(bArr);
                if (read > 0) {
                    messageDigest.update(bArr, 0, read);
                }
            } while (read != -1);
            String bigInteger = new BigInteger(1, messageDigest.digest()).toString(16);
            C6562gT0.o(bigInteger, "BigInteger(1, md.digest()).toString(16)");
            C5033aE.a(bufferedInputStream, null);
            return bigInteger;
        } finally {
        }
    }
}
