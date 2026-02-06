package o;

import com.google.firebase.sessions.settings.RemoteSettings;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLClassLoader;
import java.nio.charset.Charset;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.jar.Attributes;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.jar.Manifest;
import java.util.logging.Level;
import java.util.logging.Logger;
import o.AbstractC5317bO0;
import o.AbstractC9481sO0;
import o.C6497gD;

@InterfaceC5359ba0
/* renamed from: o.gD  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6497gD {
    public static final Logger b = Logger.getLogger(C6497gD.class.getName());
    public static final C5365bb2 c = C5365bb2.i(C4500Ve2.b).g();
    public static final String d = ".class";
    public final AbstractC9481sO0<c> a;

    /* renamed from: o.gD$a */
    /* loaded from: classes3.dex */
    public static final class a extends c {
        public final String d;

        public a(File file, String str, ClassLoader classLoader) {
            super(file, str, classLoader);
            this.d = C6497gD.e(str);
        }

        public String g() {
            return this.d;
        }

        public String h() {
            return C7037iQ1.b(this.d);
        }

        public String i() {
            int lastIndexOf = this.d.lastIndexOf(36);
            if (lastIndexOf != -1) {
                return SA.m(C3599Ly1.j, '9').V(this.d.substring(lastIndexOf + 1));
            }
            String h = h();
            if (h.isEmpty()) {
                return this.d;
            }
            return this.d.substring(h.length() + 1);
        }

        public boolean j() {
            if (this.d.indexOf(36) == -1) {
                return true;
            }
            return false;
        }

        public Class<?> k() {
            try {
                return this.c.loadClass(this.d);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException(e);
            }
        }

        @Override // o.C6497gD.c
        public String toString() {
            return this.d;
        }
    }

    /* renamed from: o.gD$b */
    /* loaded from: classes3.dex */
    public static final class b {
        public final File a;
        public final ClassLoader b;

        public b(File file, ClassLoader classLoader) {
            this.a = (File) C10664xF1.E(file);
            this.b = (ClassLoader) C10664xF1.E(classLoader);
        }

        public final File a() {
            return this.a;
        }

        public final void b(File file, Set<File> set, AbstractC9481sO0.a<c> aVar) throws IOException {
            try {
                if (!file.exists()) {
                    return;
                }
                if (file.isDirectory()) {
                    d(file, aVar);
                } else {
                    e(file, set, aVar);
                }
            } catch (SecurityException e) {
                Logger logger = C6497gD.b;
                String valueOf = String.valueOf(file);
                String valueOf2 = String.valueOf(e);
                StringBuilder sb = new StringBuilder(valueOf.length() + 16 + valueOf2.length());
                sb.append("Cannot access ");
                sb.append(valueOf);
                sb.append(": ");
                sb.append(valueOf2);
                logger.warning(sb.toString());
            }
        }

        public final void c(File file, String str, Set<File> set, AbstractC9481sO0.a<c> aVar) throws IOException {
            String str2;
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                Logger logger = C6497gD.b;
                String valueOf = String.valueOf(file);
                StringBuilder sb = new StringBuilder(valueOf.length() + 22);
                sb.append("Cannot read directory ");
                sb.append(valueOf);
                logger.warning(sb.toString());
                return;
            }
            for (File file2 : listFiles) {
                String name = file2.getName();
                if (file2.isDirectory()) {
                    File canonicalFile = file2.getCanonicalFile();
                    if (set.add(canonicalFile)) {
                        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(name).length());
                        sb2.append(str);
                        sb2.append(name);
                        sb2.append(RemoteSettings.i);
                        c(canonicalFile, sb2.toString(), set, aVar);
                        set.remove(canonicalFile);
                    }
                } else {
                    String valueOf2 = String.valueOf(str);
                    String valueOf3 = String.valueOf(name);
                    if (valueOf3.length() != 0) {
                        str2 = valueOf2.concat(valueOf3);
                    } else {
                        str2 = new String(valueOf2);
                    }
                    if (!str2.equals("META-INF/MANIFEST.MF")) {
                        aVar.g(c.e(file2, str2, this.b));
                    }
                }
            }
        }

        public final void d(File file, AbstractC9481sO0.a<c> aVar) throws IOException {
            HashSet hashSet = new HashSet();
            hashSet.add(file.getCanonicalFile());
            c(file, "", hashSet, aVar);
        }

        public final void e(File file, Set<File> set, AbstractC9481sO0.a<c> aVar) throws IOException {
            try {
                JarFile jarFile = new JarFile(file);
                try {
                    AbstractC6237fB2<File> it = C6497gD.h(file, jarFile.getManifest()).iterator();
                    while (it.hasNext()) {
                        File next = it.next();
                        if (set.add(next.getCanonicalFile())) {
                            b(next, set, aVar);
                        }
                    }
                    f(jarFile, aVar);
                    try {
                        jarFile.close();
                    } catch (IOException unused) {
                    }
                } catch (Throwable th) {
                    try {
                        jarFile.close();
                    } catch (IOException unused2) {
                    }
                    throw th;
                }
            } catch (IOException unused3) {
            }
        }

        public boolean equals(@MB Object obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (this.a.equals(bVar.a) && this.b.equals(bVar.b)) {
                    return true;
                }
            }
            return false;
        }

        public final void f(JarFile jarFile, AbstractC9481sO0.a<c> aVar) {
            Enumeration<JarEntry> entries = jarFile.entries();
            while (entries.hasMoreElements()) {
                JarEntry nextElement = entries.nextElement();
                if (!nextElement.isDirectory() && !nextElement.getName().equals("META-INF/MANIFEST.MF")) {
                    aVar.g(c.e(new File(jarFile.getName()), nextElement.getName(), this.b));
                }
            }
        }

        public AbstractC9481sO0<c> g() throws IOException {
            return h(new HashSet());
        }

        public AbstractC9481sO0<c> h(Set<File> set) throws IOException {
            AbstractC9481sO0.a<c> r = AbstractC9481sO0.r();
            set.add(this.a);
            b(this.a, set, r);
            return r.e();
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            return this.a.toString();
        }
    }

    /* renamed from: o.gD$c */
    /* loaded from: classes3.dex */
    public static class c {
        public final File a;
        public final String b;
        public final ClassLoader c;

        public c(File file, String str, ClassLoader classLoader) {
            this.a = (File) C10664xF1.E(file);
            this.b = (String) C10664xF1.E(str);
            this.c = (ClassLoader) C10664xF1.E(classLoader);
        }

        public static c e(File file, String str, ClassLoader classLoader) {
            if (str.endsWith(C6497gD.d)) {
                return new a(file, str, classLoader);
            }
            return new c(file, str, classLoader);
        }

        public final AbstractC7625ks a() {
            return C9988uT1.a(f());
        }

        public final AbstractC7459kB b(Charset charset) {
            return C9988uT1.b(f(), charset);
        }

        public final File c() {
            return this.a;
        }

        public final String d() {
            return this.b;
        }

        public boolean equals(@MB Object obj) {
            if (obj instanceof c) {
                c cVar = (c) obj;
                if (this.b.equals(cVar.b) && this.c == cVar.c) {
                    return true;
                }
            }
            return false;
        }

        public final URL f() {
            URL resource = this.c.getResource(this.b);
            if (resource != null) {
                return resource;
            }
            throw new NoSuchElementException(this.b);
        }

        public int hashCode() {
            return this.b.hashCode();
        }

        public String toString() {
            return this.b;
        }
    }

    public C6497gD(AbstractC9481sO0<c> abstractC9481sO0) {
        this.a = abstractC9481sO0;
    }

    public static C6497gD b(ClassLoader classLoader) throws IOException {
        AbstractC9481sO0<b> m = m(classLoader);
        HashSet hashSet = new HashSet();
        AbstractC6237fB2<b> it = m.iterator();
        while (it.hasNext()) {
            hashSet.add(it.next().a());
        }
        AbstractC9481sO0.a r = AbstractC9481sO0.r();
        AbstractC6237fB2<b> it2 = m.iterator();
        while (it2.hasNext()) {
            r.c(it2.next().h(hashSet));
        }
        return new C6497gD(r.e());
    }

    public static AbstractC5317bO0<URL> d(ClassLoader classLoader) {
        if (classLoader instanceof URLClassLoader) {
            return AbstractC5317bO0.H(((URLClassLoader) classLoader).getURLs());
        }
        if (classLoader.equals(ClassLoader.getSystemClassLoader())) {
            return n();
        }
        return AbstractC5317bO0.L();
    }

    @InterfaceC5299bJ2
    public static String e(String str) {
        return str.substring(0, str.length() - 6).replace('/', '.');
    }

    @InterfaceC5299bJ2
    public static AbstractC6044eO0<File, ClassLoader> f(ClassLoader classLoader) {
        LinkedHashMap c0 = C7935m81.c0();
        ClassLoader parent = classLoader.getParent();
        if (parent != null) {
            c0.putAll(f(parent));
        }
        AbstractC6237fB2<URL> it = d(classLoader).iterator();
        while (it.hasNext()) {
            URL next = it.next();
            if (next.getProtocol().equals("file")) {
                File o2 = o(next);
                if (!c0.containsKey(o2)) {
                    c0.put(o2, classLoader);
                }
            }
        }
        return AbstractC6044eO0.g(c0);
    }

    @InterfaceC5299bJ2
    public static URL g(File file, String str) throws MalformedURLException {
        return new URL(file.toURI().toURL(), str);
    }

    @InterfaceC5299bJ2
    public static AbstractC9481sO0<File> h(File file, @MB Manifest manifest) {
        String str;
        if (manifest == null) {
            return AbstractC9481sO0.M();
        }
        AbstractC9481sO0.a r = AbstractC9481sO0.r();
        String value = manifest.getMainAttributes().getValue(Attributes.Name.CLASS_PATH.toString());
        if (value != null) {
            for (String str2 : c.n(value)) {
                try {
                    URL g = g(file, str2);
                    if (g.getProtocol().equals("file")) {
                        r.g(o(g));
                    }
                } catch (MalformedURLException unused) {
                    Logger logger = b;
                    String valueOf = String.valueOf(str2);
                    if (valueOf.length() != 0) {
                        str = "Invalid Class-Path entry: ".concat(valueOf);
                    } else {
                        str = new String("Invalid Class-Path entry: ");
                    }
                    logger.warning(str);
                }
            }
        }
        return r.e();
    }

    public static AbstractC9481sO0<b> m(ClassLoader classLoader) {
        AbstractC9481sO0.a r = AbstractC9481sO0.r();
        AbstractC6237fB2<Map.Entry<File, ClassLoader>> it = f(classLoader).entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<File, ClassLoader> next = it.next();
            r.g(new b(next.getKey(), next.getValue()));
        }
        return r.e();
    }

    @InterfaceC5299bJ2
    public static AbstractC5317bO0<URL> n() {
        String str;
        AbstractC5317bO0.a r = AbstractC5317bO0.r();
        for (String str2 : C5365bb2.i(EnumC4391Ub2.PATH_SEPARATOR.h()).n(EnumC4391Ub2.JAVA_CLASS_PATH.h())) {
            try {
                try {
                    r.g(new File(str2).toURI().toURL());
                } catch (SecurityException unused) {
                    r.g(new URL("file", (String) null, new File(str2).getAbsolutePath()));
                }
            } catch (MalformedURLException e) {
                Logger logger = b;
                Level level = Level.WARNING;
                String valueOf = String.valueOf(str2);
                if (valueOf.length() != 0) {
                    str = "malformed classpath entry: ".concat(valueOf);
                } else {
                    str = new String("malformed classpath entry: ");
                }
                logger.log(level, str, (Throwable) e);
            }
        }
        return r.e();
    }

    @InterfaceC5299bJ2
    public static File o(URL url) {
        C10664xF1.d(url.getProtocol().equals("file"));
        try {
            return new File(url.toURI());
        } catch (URISyntaxException unused) {
            return new File(url.getPath());
        }
    }

    public AbstractC9481sO0<a> c() {
        return AbstractC10343vw0.J(this.a).D(a.class).j0();
    }

    public AbstractC9481sO0<c> i() {
        return this.a;
    }

    public AbstractC9481sO0<a> j() {
        return AbstractC10343vw0.J(this.a).D(a.class).F(new IF1() { // from class: o.fD
            @Override // o.IF1
            public final boolean apply(Object obj) {
                return ((C6497gD.a) obj).j();
            }
        }).j0();
    }

    public AbstractC9481sO0<a> k(String str) {
        C10664xF1.E(str);
        AbstractC9481sO0.a r = AbstractC9481sO0.r();
        AbstractC6237fB2<a> it = j().iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (next.h().equals(str)) {
                r.g(next);
            }
        }
        return r.e();
    }

    public AbstractC9481sO0<a> l(String str) {
        C10664xF1.E(str);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1);
        sb.append(str);
        sb.append('.');
        String sb2 = sb.toString();
        AbstractC9481sO0.a r = AbstractC9481sO0.r();
        AbstractC6237fB2<a> it = j().iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (next.g().startsWith(sb2)) {
                r.g(next);
            }
        }
        return r.e();
    }
}
