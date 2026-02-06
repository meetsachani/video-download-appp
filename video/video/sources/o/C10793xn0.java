package o;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ServiceLoader;
import java.util.Set;
import java.util.jar.JarFile;
import java.util.zip.ZipEntry;
import org.jetbrains.annotations.NotNull;

@InterfaceC8303na2({"SMAP\nFastServiceLoader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FastServiceLoader.kt\nkotlinx/coroutines/internal/FastServiceLoader\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,169:1\n85#1,5:170\n85#1,5:175\n139#1,13:191\n1#2:180\n1368#3:181\n1454#3,5:182\n1557#3:187\n1628#3,3:188\n1069#4,2:204\n*S KotlinDebug\n*F\n+ 1 FastServiceLoader.kt\nkotlinx/coroutines/internal/FastServiceLoader\n*L\n62#1:170,5\n69#1:175,5\n125#1:191,13\n107#1:181\n107#1:182,5\n109#1:187\n109#1:188,3\n161#1:204,2\n*E\n"})
/* renamed from: o.xn0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C10793xn0 {
    @NotNull
    public static final C10793xn0 a = new C10793xn0();
    @NotNull
    public static final String b = "META-INF/services/";

    public final InterfaceC9171r71 a(Class<InterfaceC9171r71> cls, String str) {
        try {
            return cls.cast(Class.forName(str, true, cls.getClassLoader()).getDeclaredConstructor(null).newInstance(null));
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public final <S> S b(String str, ClassLoader classLoader, Class<S> cls) {
        Class<?> cls2 = Class.forName(str, false, classLoader);
        if (cls.isAssignableFrom(cls2)) {
            return cls.cast(cls2.getDeclaredConstructor(null).newInstance(null));
        }
        throw new IllegalArgumentException(("Expected service of class " + cls + ", but found " + cls2).toString());
    }

    public final <S> List<S> c(Class<S> cls, ClassLoader classLoader) {
        try {
            return e(cls, classLoader);
        } catch (Throwable unused) {
            return C10662xF.Y5(ServiceLoader.load(cls, classLoader));
        }
    }

    @NotNull
    public final List<InterfaceC9171r71> d() {
        InterfaceC9171r71 interfaceC9171r71;
        if (!C11036yn0.a()) {
            return c(InterfaceC9171r71.class, InterfaceC9171r71.class.getClassLoader());
        }
        try {
            ArrayList arrayList = new ArrayList(2);
            InterfaceC9171r71 interfaceC9171r712 = null;
            try {
                interfaceC9171r71 = (InterfaceC9171r71) InterfaceC9171r71.class.cast(Class.forName("o.W8", true, InterfaceC9171r71.class.getClassLoader()).getDeclaredConstructor(null).newInstance(null));
            } catch (ClassNotFoundException unused) {
                interfaceC9171r71 = null;
            }
            if (interfaceC9171r71 == null) {
                return c(InterfaceC9171r71.class, InterfaceC9171r71.class.getClassLoader());
            }
            arrayList.add(interfaceC9171r71);
            try {
                interfaceC9171r712 = (InterfaceC9171r71) InterfaceC9171r71.class.cast(Class.forName("kotlinx.coroutines.test.internal.TestMainDispatcherFactory", true, InterfaceC9171r71.class.getClassLoader()).getDeclaredConstructor(null).newInstance(null));
            } catch (ClassNotFoundException unused2) {
            }
            if (interfaceC9171r712 != null) {
                arrayList.add(interfaceC9171r712);
                return arrayList;
            }
            return arrayList;
        } catch (Throwable unused3) {
            return c(InterfaceC9171r71.class, InterfaceC9171r71.class.getClassLoader());
        }
    }

    @NotNull
    public final <S> List<S> e(@NotNull Class<S> cls, @NotNull ClassLoader classLoader) {
        ArrayList<URL> list = Collections.list(classLoader.getResources(b + cls.getName()));
        C6562gT0.o(list, "list(...)");
        ArrayList arrayList = new ArrayList();
        for (URL url : list) {
            C9444sF.q0(arrayList, a.f(url));
        }
        Set<String> d6 = C10662xF.d6(arrayList);
        if (!d6.isEmpty()) {
            ArrayList arrayList2 = new ArrayList(C8466oF.b0(d6, 10));
            for (String str : d6) {
                arrayList2.add(a.b(str, classLoader, cls));
            }
            return arrayList2;
        }
        throw new IllegalArgumentException("No providers were loaded with FastServiceLoader");
    }

    public final List<String> f(URL url) {
        String url2 = url.toString();
        if (C9545sf2.J2(url2, "jar", false, 2, null)) {
            String T5 = C10763xf2.T5(C10763xf2.M5(url2, "jar:file:", null, 2, null), '!', null, 2, null);
            String M5 = C10763xf2.M5(url2, "!/", null, 2, null);
            JarFile jarFile = new JarFile(T5, false);
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(jarFile.getInputStream(new ZipEntry(M5)), "UTF-8"));
                List<String> g = a.g(bufferedReader);
                C5033aE.a(bufferedReader, null);
                jarFile.close();
                return g;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    try {
                        jarFile.close();
                        throw th2;
                    } catch (Throwable th3) {
                        C3917Pf0.a(th, th3);
                        throw th;
                    }
                }
            }
        }
        BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(url.openStream()));
        try {
            List<String> g2 = a.g(bufferedReader2);
            C5033aE.a(bufferedReader2, null);
            return g2;
        } catch (Throwable th4) {
            try {
                throw th4;
            } catch (Throwable th5) {
                C5033aE.a(bufferedReader2, th4);
                throw th5;
            }
        }
    }

    public final List<String> g(BufferedReader bufferedReader) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                return C10662xF.Y5(linkedHashSet);
            }
            String obj = C10763xf2.b6(C10763xf2.U5(readLine, "#", null, 2, null)).toString();
            for (int i = 0; i < obj.length(); i++) {
                char charAt = obj.charAt(i);
                if (charAt != '.' && !Character.isJavaIdentifierPart(charAt)) {
                    throw new IllegalArgumentException(("Illegal service provider class name: " + obj).toString());
                }
            }
            if (obj.length() > 0) {
                linkedHashSet.add(obj);
            }
        }
    }

    public final <R> R h(JarFile jarFile, HA0<? super JarFile, ? extends R> ha0) {
        try {
            R invoke = ha0.invoke(jarFile);
            UP0.d(1);
            jarFile.close();
            UP0.c(1);
            return invoke;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                UP0.d(1);
                try {
                    jarFile.close();
                    UP0.c(1);
                    throw th2;
                } catch (Throwable th3) {
                    C3917Pf0.a(th, th3);
                    throw th;
                }
            }
        }
    }
}
