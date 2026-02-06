package o;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: o.jp  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C7370jp extends C10047uj2 implements InterfaceC7856lp {
    private static final long serialVersionUID = 1536432911093974264L;
    public final long Y0;
    public final int Z;

    /* renamed from: o.jp$a */
    /* loaded from: classes4.dex */
    public class a extends C7176j1 {
        public final /* synthetic */ C7370jp Y;

        public a(C7370jp c7370jp, Iterator it) {
            super(it);
            this.Y = c7370jp;
        }

        @Override // o.C7176j1, java.util.Iterator
        public void remove() {
            synchronized (this.Y.Y) {
                this.X.remove();
                this.Y.Y.notifyAll();
            }
        }
    }

    public C7370jp(InterfaceC5664cq interfaceC5664cq, int i, long j) {
        super(interfaceC5664cq);
        if (i >= 1) {
            this.Z = i;
            this.Y0 = j;
            return;
        }
        throw new IllegalArgumentException();
    }

    public static C7370jp j(InterfaceC5664cq interfaceC5664cq, int i) {
        return new C7370jp(interfaceC5664cq, i, 0L);
    }

    public static C7370jp k(InterfaceC5664cq interfaceC5664cq, int i, long j) {
        return new C7370jp(interfaceC5664cq, i, j);
    }

    @Override // o.C3349Jj2, java.util.Collection
    public boolean add(Object obj) {
        boolean add;
        synchronized (this.Y) {
            l(1);
            add = f().add(obj);
        }
        return add;
    }

    @Override // o.C3349Jj2, java.util.Collection
    public boolean addAll(Collection collection) {
        boolean addAll;
        synchronized (this.Y) {
            l(collection.size());
            addAll = f().addAll(collection);
        }
        return addAll;
    }

    @Override // o.C3349Jj2, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return new a(this, this.X.iterator());
    }

    public final void l(int i) {
        if (i <= this.Z) {
            if (this.Y0 <= 0) {
                if (f().size() + i > this.Z) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("Buffer size cannot exceed ");
                    stringBuffer.append(this.Z);
                    throw new C7374jq(stringBuffer.toString());
                }
                return;
            }
            long currentTimeMillis = System.currentTimeMillis() + this.Y0;
            long currentTimeMillis2 = System.currentTimeMillis();
            while (true) {
                long j = currentTimeMillis - currentTimeMillis2;
                if (j <= 0 || f().size() + i <= this.Z) {
                    break;
                }
                try {
                    this.Y.wait(j);
                    currentTimeMillis2 = System.currentTimeMillis();
                } catch (InterruptedException e) {
                    PrintWriter printWriter = new PrintWriter(new StringWriter());
                    e.printStackTrace(printWriter);
                    StringBuffer stringBuffer2 = new StringBuffer();
                    stringBuffer2.append("Caused by InterruptedException: ");
                    stringBuffer2.append(printWriter.toString());
                    throw new C7860lq(stringBuffer2.toString());
                }
            }
            if (f().size() + i <= this.Z) {
                return;
            }
            throw new C7374jq("Timeout expired");
        }
        StringBuffer stringBuffer3 = new StringBuffer();
        stringBuffer3.append("Buffer size cannot exceed ");
        stringBuffer3.append(this.Z);
        throw new C7374jq(stringBuffer3.toString());
    }

    @Override // o.InterfaceC7856lp
    public int q() {
        return this.Z;
    }

    @Override // o.C10047uj2, o.InterfaceC5664cq
    public Object remove() {
        Object remove;
        synchronized (this.Y) {
            remove = f().remove();
            this.Y.notifyAll();
        }
        return remove;
    }

    @Override // o.InterfaceC7856lp
    public boolean s() {
        if (size() == q()) {
            return true;
        }
        return false;
    }
}
