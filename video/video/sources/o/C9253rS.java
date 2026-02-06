package o;

import android.database.Cursor;
import android.widget.Filter;

/* renamed from: o.rS  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C9253rS extends Filter {
    public a a;

    /* renamed from: o.rS$a */
    /* loaded from: classes.dex */
    public interface a {
        void a(Cursor cursor);

        Cursor b(CharSequence charSequence);

        Cursor c();

        CharSequence convertToString(Cursor cursor);
    }

    public C9253rS(a aVar) {
        this.a = aVar;
    }

    @Override // android.widget.Filter
    public CharSequence convertResultToString(Object obj) {
        return this.a.convertToString((Cursor) obj);
    }

    @Override // android.widget.Filter
    public Filter.FilterResults performFiltering(CharSequence charSequence) {
        Cursor b = this.a.b(charSequence);
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (b != null) {
            filterResults.count = b.getCount();
            filterResults.values = b;
            return filterResults;
        }
        filterResults.count = 0;
        filterResults.values = null;
        return filterResults;
    }

    @Override // android.widget.Filter
    public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        Cursor c = this.a.c();
        Object obj = filterResults.values;
        if (obj != null && obj != c) {
            this.a.a((Cursor) obj);
        }
    }
}
