package o;

import java.io.IOException;

/* renamed from: o.rT0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C9258rT0 extends IOException {
    private static final long serialVersionUID = -1616151763072450476L;
    public InterfaceC3540Li1 X;

    /* renamed from: o.rT0$a */
    /* loaded from: classes.dex */
    public static class a extends C9258rT0 {
        private static final long serialVersionUID = 3283890091615336259L;

        public a(String str) {
            super(str);
        }
    }

    public C9258rT0(String str) {
        super(str);
        this.X = null;
    }

    public static C9258rT0 b() {
        return new C9258rT0("Protocol message end-group tag did not match expected tag.");
    }

    public static C9258rT0 c() {
        return new C9258rT0("Protocol message contained an invalid tag (zero).");
    }

    public static C9258rT0 d() {
        return new C9258rT0("Protocol message had invalid UTF-8.");
    }

    public static a e() {
        return new a("Protocol message tag had invalid wire type.");
    }

    public static C9258rT0 f() {
        return new C9258rT0("CodedInputStream encountered a malformed varint.");
    }

    public static C9258rT0 g() {
        return new C9258rT0("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static C9258rT0 h() {
        return new C9258rT0("Failed to parse the message.");
    }

    public static C9258rT0 i() {
        return new C9258rT0("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    public static C9258rT0 k() {
        return new C9258rT0("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    public static C9258rT0 l() {
        return new C9258rT0("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public InterfaceC3540Li1 a() {
        return this.X;
    }

    public C9258rT0 j(InterfaceC3540Li1 interfaceC3540Li1) {
        this.X = interfaceC3540Li1;
        return this;
    }

    public IOException m() {
        if (getCause() instanceof IOException) {
            return (IOException) getCause();
        }
        return this;
    }

    public C9258rT0(IOException iOException) {
        super(iOException.getMessage(), iOException);
        this.X = null;
    }

    public C9258rT0(String str, IOException iOException) {
        super(str, iOException);
        this.X = null;
    }
}
