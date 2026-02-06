package o;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.FilterQueryProvider;
import android.widget.Filterable;
import o.C9253rS;

/* renamed from: o.qS  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC9004qS extends BaseAdapter implements Filterable, C9253rS.a {
    @Deprecated
    public static final int e1 = 1;
    public static final int f1 = 2;
    public boolean X;
    public boolean Y;
    public Context Y0;
    public Cursor Z;
    public int Z0;
    public a a1;
    public DataSetObserver b1;
    public C9253rS c1;
    public FilterQueryProvider d1;

    /* renamed from: o.qS$a */
    /* loaded from: classes.dex */
    public class a extends ContentObserver {
        public a() {
            super(new Handler());
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z) {
            AbstractC9004qS.this.t();
        }
    }

    /* renamed from: o.qS$b */
    /* loaded from: classes.dex */
    public class b extends DataSetObserver {
        public b() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            AbstractC9004qS abstractC9004qS = AbstractC9004qS.this;
            abstractC9004qS.X = true;
            abstractC9004qS.notifyDataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            AbstractC9004qS abstractC9004qS = AbstractC9004qS.this;
            abstractC9004qS.X = false;
            abstractC9004qS.notifyDataSetInvalidated();
        }
    }

    @Deprecated
    public AbstractC9004qS(Context context, Cursor cursor) {
        g(context, cursor, 1);
    }

    public void a(Cursor cursor) {
        Cursor v = v(cursor);
        if (v != null) {
            v.close();
        }
    }

    public Cursor b(CharSequence charSequence) {
        FilterQueryProvider filterQueryProvider = this.d1;
        if (filterQueryProvider != null) {
            return filterQueryProvider.runQuery(charSequence);
        }
        return this.Z;
    }

    @Override // o.C9253rS.a
    public Cursor c() {
        return this.Z;
    }

    public CharSequence convertToString(Cursor cursor) {
        if (cursor == null) {
            return "";
        }
        return cursor.toString();
    }

    public abstract void d(View view, Context context, Cursor cursor);

    public FilterQueryProvider f() {
        return this.d1;
    }

    public void g(Context context, Cursor cursor, int i) {
        int i2;
        boolean z = false;
        if ((i & 1) == 1) {
            i |= 2;
            this.Y = true;
        } else {
            this.Y = false;
        }
        if (cursor != null) {
            z = true;
        }
        this.Z = cursor;
        this.X = z;
        this.Y0 = context;
        if (z) {
            i2 = cursor.getColumnIndexOrThrow("_id");
        } else {
            i2 = -1;
        }
        this.Z0 = i2;
        if ((i & 2) == 2) {
            this.a1 = new a();
            this.b1 = new b();
        } else {
            this.a1 = null;
            this.b1 = null;
        }
        if (z) {
            a aVar = this.a1;
            if (aVar != null) {
                cursor.registerContentObserver(aVar);
            }
            DataSetObserver dataSetObserver = this.b1;
            if (dataSetObserver != null) {
                cursor.registerDataSetObserver(dataSetObserver);
            }
        }
    }

    @Override // android.widget.Adapter
    public int getCount() {
        Cursor cursor;
        if (this.X && (cursor = this.Z) != null) {
            return cursor.getCount();
        }
        return 0;
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (this.X) {
            this.Z.moveToPosition(i);
            if (view == null) {
                view = r(this.Y0, this.Z, viewGroup);
            }
            d(view, this.Y0, this.Z);
            return view;
        }
        return null;
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        if (this.c1 == null) {
            this.c1 = new C9253rS(this);
        }
        return this.c1;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        Cursor cursor;
        if (this.X && (cursor = this.Z) != null) {
            cursor.moveToPosition(i);
            return this.Z;
        }
        return null;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        Cursor cursor;
        if (!this.X || (cursor = this.Z) == null || !cursor.moveToPosition(i)) {
            return 0L;
        }
        return this.Z.getLong(this.Z0);
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (this.X) {
            if (this.Z.moveToPosition(i)) {
                if (view == null) {
                    view = s(this.Y0, this.Z, viewGroup);
                }
                d(view, this.Y0, this.Z);
                return view;
            }
            throw new IllegalStateException("couldn't move cursor to position " + i);
        }
        throw new IllegalStateException("this should only be called when the cursor is valid");
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return true;
    }

    @Deprecated
    public void q(Context context, Cursor cursor, boolean z) {
        int i;
        if (z) {
            i = 1;
        } else {
            i = 2;
        }
        g(context, cursor, i);
    }

    public View r(Context context, Cursor cursor, ViewGroup viewGroup) {
        return s(context, cursor, viewGroup);
    }

    public abstract View s(Context context, Cursor cursor, ViewGroup viewGroup);

    public void t() {
        Cursor cursor;
        if (this.Y && (cursor = this.Z) != null && !cursor.isClosed()) {
            this.X = this.Z.requery();
        }
    }

    public void u(FilterQueryProvider filterQueryProvider) {
        this.d1 = filterQueryProvider;
    }

    public Cursor v(Cursor cursor) {
        Cursor cursor2 = this.Z;
        if (cursor == cursor2) {
            return null;
        }
        if (cursor2 != null) {
            a aVar = this.a1;
            if (aVar != null) {
                cursor2.unregisterContentObserver(aVar);
            }
            DataSetObserver dataSetObserver = this.b1;
            if (dataSetObserver != null) {
                cursor2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.Z = cursor;
        if (cursor != null) {
            a aVar2 = this.a1;
            if (aVar2 != null) {
                cursor.registerContentObserver(aVar2);
            }
            DataSetObserver dataSetObserver2 = this.b1;
            if (dataSetObserver2 != null) {
                cursor.registerDataSetObserver(dataSetObserver2);
            }
            this.Z0 = cursor.getColumnIndexOrThrow("_id");
            this.X = true;
            notifyDataSetChanged();
            return cursor2;
        }
        this.Z0 = -1;
        this.X = false;
        notifyDataSetInvalidated();
        return cursor2;
    }

    public AbstractC9004qS(Context context, Cursor cursor, boolean z) {
        g(context, cursor, z ? 1 : 2);
    }

    public AbstractC9004qS(Context context, Cursor cursor, int i) {
        g(context, cursor, i);
    }
}
