package o;

@InterfaceC11149zF0
@InterfaceC8301na0
/* renamed from: o.Ub2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public enum EnumC4391Ub2 {
    JAVA_VERSION("java.version"),
    JAVA_VENDOR("java.vendor"),
    JAVA_VENDOR_URL("java.vendor.url"),
    JAVA_HOME(C3451Kk2.f),
    JAVA_VM_SPECIFICATION_VERSION("java.vm.specification.version"),
    JAVA_VM_SPECIFICATION_VENDOR("java.vm.specification.vendor"),
    JAVA_VM_SPECIFICATION_NAME("java.vm.specification.name"),
    JAVA_VM_VERSION("java.vm.version"),
    JAVA_VM_VENDOR("java.vm.vendor"),
    JAVA_VM_NAME("java.vm.name"),
    JAVA_SPECIFICATION_VERSION("java.specification.version"),
    JAVA_SPECIFICATION_VENDOR("java.specification.vendor"),
    JAVA_SPECIFICATION_NAME("java.specification.name"),
    JAVA_CLASS_VERSION("java.class.version"),
    JAVA_CLASS_PATH("java.class.path"),
    JAVA_LIBRARY_PATH("java.library.path"),
    JAVA_IO_TMPDIR(C3451Kk2.e),
    JAVA_COMPILER("java.compiler"),
    JAVA_EXT_DIRS("java.ext.dirs"),
    OS_NAME("os.name"),
    OS_ARCH("os.arch"),
    OS_VERSION("os.version"),
    FILE_SEPARATOR("file.separator"),
    PATH_SEPARATOR("path.separator"),
    LINE_SEPARATOR("line.separator"),
    USER_NAME(C3451Kk2.c),
    USER_HOME(C3451Kk2.b),
    USER_DIR(C3451Kk2.d);
    
    public final String X;

    EnumC4391Ub2(String str) {
        this.X = str;
    }

    public String g() {
        return this.X;
    }

    @MB
    public String h() {
        return System.getProperty(this.X);
    }

    @Override // java.lang.Enum
    public String toString() {
        String g = g();
        String h = h();
        StringBuilder sb = new StringBuilder(String.valueOf(g).length() + 1 + String.valueOf(h).length());
        sb.append(g);
        sb.append("=");
        sb.append(h);
        return sb.toString();
    }
}
