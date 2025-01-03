package chat1.li.chatting.domain.chat.ChatRoom.repository;

import chat1.li.chatting.domain.chat.ChatRoom.entity.ChatRoom;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChatRoomRepository extends JpaRepository<ChatRoom, Long> {
}
