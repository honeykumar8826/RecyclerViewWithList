package com.recycler.recyclerviewwithlist;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

public class ChatAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private final String TAG = "TAG";
    private final List<ChatModal> chatModalList;

    public ChatAdapter(List<ChatModal> chatModalList) {
        this.chatModalList = chatModalList;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        Log.i(TAG, "onCreateViewHolder: ");
        RecyclerView.ViewHolder viewHolder;
        View view;
        if (i == 1) {
            view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.chat_left_layout, viewGroup, false);
            viewHolder = new ViewHolderSenderPart(view);
        } else {
            view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.chat_right_layout, viewGroup, false);
            viewHolder = new ViewHolderRecieverPart(view);
        }
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
       /* ChatModal chatModal = chatModalList.get(i);
         viewHolder.itemView.findViewById(R.id.tv_chat);*/
        Log.i(TAG, "onBindViewHolder: " + viewHolder.getItemViewType());
    }

    @Override
    public int getItemViewType(int position) {
        Log.i(TAG, "getItemViewType: " + position);
        if (chatModalList.get(position).getConditionValue().equals("true")) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public int getItemCount() {
        return chatModalList.size();
    }

    /* inner class for getting the Sender view layout  */
    public class ViewHolderSenderPart extends RecyclerView.ViewHolder {
//        public TextView state;

        public ViewHolderSenderPart(@NonNull View itemView) {
            super(itemView);
//            state = itemView.findViewById(R.id.tv_chat);
        }
    }

    /* inner class for getting the Reciever view layout  */
    public class ViewHolderRecieverPart extends RecyclerView.ViewHolder {
//        public TextView state;

        public ViewHolderRecieverPart(@NonNull View itemView) {
            super(itemView);
//            state = itemView.findViewById(R.id.tv_chat_reciever);
        }
    }
}
