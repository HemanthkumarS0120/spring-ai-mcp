package com.springai.mcpserverremote.repository;


import com.springai.mcpserverremote.entity.HelpDeskTicket;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface HelpDeskTicketRepository extends JpaRepository<com.springai.mcpserverremote.entity.HelpDeskTicket,Long> {

    List<HelpDeskTicket> findByUsername(String username);
}
