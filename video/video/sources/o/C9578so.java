package o;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Collection;

/* renamed from: o.so  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C9578so extends C10047uj2 {
    private static final long serialVersionUID = 1719328905017860541L;
    public final long Z;

    public C9578so(InterfaceC5664cq interfaceC5664cq) {
        super(interfaceC5664cq);
        this.Z = 0L;
    }

    public static InterfaceC5664cq e(InterfaceC5664cq interfaceC5664cq) {
        return new C9578so(interfaceC5664cq);
    }

    public static InterfaceC5664cq h(InterfaceC5664cq interfaceC5664cq, long j) {
        return new C9578so(interfaceC5664cq, j);
    }

    @Override // o.C3349Jj2, java.util.Collection
    public boolean add(Object obj) {
        boolean add;
        synchronized (this.Y) {
            add = this.X.add(obj);
            this.Y.notifyAll();
        }
        return add;
    }

    @Override // o.C3349Jj2, java.util.Collection
    public boolean addAll(Collection collection) {
        boolean addAll;
        synchronized (this.Y) {
            addAll = this.X.addAll(collection);
            this.Y.notifyAll();
        }
        return addAll;
    }

    @Override // o.C10047uj2, o.InterfaceC5664cq
    public Object get() {
        synchronized (this.Y) {
            while (this.X.isEmpty()) {
                try {
                    try {
                        long j = this.Z;
                        if (j <= 0) {
                            this.Y.wait();
                        } else {
                            return i(j);
                        }
                    } catch (InterruptedException e) {
                        PrintWriter printWriter = new PrintWriter(new StringWriter());
                        e.printStackTrace(printWriter);
                        StringBuffer stringBuffer = new StringBuffer();
                        stringBuffer.append("Caused by InterruptedException: ");
                        stringBuffer.append(printWriter.toString());
                        throw new C7860lq(stringBuffer.toString());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return f().get();
        }
    }

    public Object i(long j) {
        Object obj;
        synchronized (this.Y) {
            long currentTimeMillis = System.currentTimeMillis() + j;
            long currentTimeMillis2 = System.currentTimeMillis();
            while (true) {
                long j2 = currentTimeMillis - currentTimeMillis2;
                if (j2 <= 0 || !this.X.isEmpty()) {
                    break;
                }
                try {
                    this.Y.wait(j2);
                    currentTimeMillis2 = System.currentTimeMillis();
                } catch (InterruptedException e) {
                    PrintWriter printWriter = new PrintWriter(new StringWriter());
                    e.printStackTrace(printWriter);
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("Caused by InterruptedException: ");
                    stringBuffer.append(printWriter.toString());
                    throw new C7860lq(stringBuffer.toString());
                }
            }
            if (!this.X.isEmpty()) {
                obj = f().get();
            } else {
                throw new C7860lq("Timeout expired");
            }
        }
        return obj;
    }

    public Object j(long j) {
        Object remove;
        synchronized (this.Y) {
            long currentTimeMillis = System.currentTimeMillis() + j;
            long currentTimeMillis2 = System.currentTimeMillis();
            while (true) {
                long j2 = currentTimeMillis - currentTimeMillis2;
                if (j2 <= 0 || !this.X.isEmpty()) {
                    break;
                }
                try {
                    this.Y.wait(j2);
                    currentTimeMillis2 = System.currentTimeMillis();
                } catch (InterruptedException e) {
                    PrintWriter printWriter = new PrintWriter(new StringWriter());
                    e.printStackTrace(printWriter);
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("Caused by InterruptedException: ");
                    stringBuffer.append(printWriter.toString());
                    throw new C7860lq(stringBuffer.toString());
                }
            }
            if (!this.X.isEmpty()) {
                remove = f().remove();
            } else {
                throw new C7860lq("Timeout expired");
            }
        }
        return remove;
    }

    @Override // o.C10047uj2, o.InterfaceC5664cq
    public Object remove() {
        synchronized (this.Y) {
            while (this.X.isEmpty()) {
                try {
                    try {
                        long j = this.Z;
                        if (j <= 0) {
                            this.Y.wait();
                        } else {
                            return j(j);
                        }
                    } catch (InterruptedException e) {
                        PrintWriter printWriter = new PrintWriter(new StringWriter());
                        e.printStackTrace(printWriter);
                        StringBuffer stringBuffer = new StringBuffer();
                        stringBuffer.append("Caused by InterruptedException: ");
                        stringBuffer.append(printWriter.toString());
                        throw new C7860lq(stringBuffer.toString());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return f().remove();
        }
    }

    public C9578so(InterfaceC5664cq interfaceC5664cq, long j) {
        super(interfaceC5664cq);
        this.Z = j < 0 ? 0L : j;
    }
}
